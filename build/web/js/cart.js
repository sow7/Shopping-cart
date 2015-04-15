/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function show_cart() {
    var products = JSON.parse(sessionStorage.getItem("cart"));
    var list = document.getElementById("product-lists");
    if (products !== null) {
        while (list.hasChildNodes())
        {
            list.removeChild(list.firstChild);
        }
        for (var i = 0; i < products.length; i++) {
            var product = products[i];
            list.insertAdjacentHTML("beforeEnd", "<li class=\"item\">\n" +
                    "                            <a>" + product.name + "  $" + product.price + "   <input type=\"number\" id=\"amount_box_" + product.id + "\" name=\"amount\" value=\"" + product.amount + "\" onchange=\"modifyAmount(" + product.id + ")\"/> <a onclick=\"removeProductFromCart(" + product.id + ")\">Delete this item</a></a>\n" +
                    "                        </li>");
        }
    }
    calculateTotalMoney();
}

function modifyAmount(id) {
    var box = document.getElementById("amount_box_" + id);
    var current_amount = box.value;
    var products = JSON.parse(sessionStorage.getItem("cart"));
    for (var i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            products[i].amount = current_amount;
        }
    }
    sessionStorage.setItem("cart", JSON.stringify(products));
    show_cart();
    calculateTotalMoney();
}

function removeProductFromCart(id) {
    var products = JSON.parse(sessionStorage.getItem("cart"));
    for (var i = 0; i < products.length; i++) {
        var product = products[i];
        if (product.id == id) {
            products.splice(i, 1);
            var pr = document.getElementById("amount_box_" + id);
            pr.parentNode.removeChild(pr);
        }
    }
    sessionStorage.setItem("cart", JSON.stringify(products));
    show_cart();
    calculateTotalMoney();
}

function calculateTotalMoney() {
    var products = JSON.parse(sessionStorage.getItem("cart"));
    var total = 0;
    for (var i = 0; i < products.length; i++) {
        var product = products[i];
        var amount = document.getElementById("amount_box_" + product.id).value;
        total += product.price * amount;
    }
    var totalDisplay = document.getElementById("totalMoney");
    totalDisplay.innerHTML = total;
}

function checkout() {
    alert("Thank you shopping at wan's website. Your order is submitted.");
}


