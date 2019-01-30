'use strict';

const URL_DEFAULT = "http://localhost:8080";
const QUICK_ORDER_URL = URL_DEFAULT + "/checklist";

var Request = {};
Request.PostQuickOrder = function (jsonObject) {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var quickOrder = JSON.parse(xhr.responseText);
            console.log(quickOrder);
            if(quickOrder != null){
            	succesQuickMessage();
            }

        }
    };

    xhr.open("POST", QUICK_ORDER_URL +"/quick" , true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(jsonObject));
};

