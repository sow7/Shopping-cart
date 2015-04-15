/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function addToCart(id) {
    //sessionStorage.removeItem("cart");
    var cart = sessionStorage.getItem("cart");
    console.log(cart);
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "GetProductById?id=" + id, true);
    xhr.send();
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            console.log(xhr.response);
            var product = JSON.parse(xhr.response);
            if (cart === null || cart === "") {
                sessionStorage.setItem("cart", "[" + JSON.stringify(product) + "]");
            } else {
                var products = JSON.parse(cart);
                for (var i = 0; i < products.length; i++) {
                    if (products[i].id == id) {
                        products[i].amount=products[i].amount+1;
                        sessionStorage.setItem("cart", JSON.stringify(products));
                        show_cart();
                        //alert("You already have this product in your bag");
                        return;
                    }
                }
                products.push(product);
                sessionStorage.setItem("cart", JSON.stringify(products));
            }
            //location.reload();
            show_cart();
        }
    };
}
