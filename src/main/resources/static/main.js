function check(){
    let table;
    for (let k=0; k<document.getElementsByClassName("input").length; k++){
        document.getElementsByClassName("input")[k].setAttribute("hidden","hidden");
    }
    let radios = document.getElementsByName("table");
    for (let i=0; i < radios.length; i++){
        if (radios[i].checked){
            table = radios[i].value;
        }
    }
    return table;
}

function update() {
    let table = check();
    let table1 = document.createElement("p");
    if (document.getElementById("result-table")) {
        document.getElementById("result-table").remove();
    }
    if (document.getElementById("output_data")) {
        document.getElementById("output_data").remove();
    }
    table1.id="result-table";
    table1.innerText = "Update";
    document.getElementsByClassName("main")[1].appendChild(table1);
    unhid(table);
}

function add() {
    let table = check();
    let table1 = document.createElement("p");
    if (document.getElementById("result-table")) {
        document.getElementById("result-table").remove();
    }
    if (document.getElementById("output_data")) {
        document.getElementById("output_data").remove();
    }
    table1.id="result-table";
    table1.innerText = "Add";
    document.getElementsByClassName("main")[1].appendChild(table1);
    unhid(table);
}

function del() {
    let table = check();
    let table1 = document.createElement("p");
    if (document.getElementById("result-table")) {
        document.getElementById("result-table").remove();
    }
    if (document.getElementById("output_data")) {
        document.getElementById("output_data").remove();
    }
    table1.id="result-table";
    table1.innerText = "Delete";
    document.getElementsByClassName("main")[1].appendChild(table1);
    unhid(table);
}

function send() {
    let table = check();
    let url = "/"+document.getElementById("result-table").innerText+"/" + table;
    if (table === "Company"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, country: document.getElementsByName("country")[0].value, function: document.getElementsByName("function")[0].value, name: document.getElementsByName("name")[0].value, type: document.getElementsByName("type")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "Country"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {country: document.getElementsByName("country")[0].value, danger: document.getElementsByName("danger")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "GadgetsFrom"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, model: document.getElementsByName("model")[0].value, manDo: document.getElementsByName("manDo")[0].value,
                placeDo: document.getElementsByName("placeDo")[0].value, type: document.getElementsByName("type")[0].value, frequency: document.getElementsByName("frequency")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "GadgetsTo"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, gadgets: document.getElementsByName("gadgets")[0].value, place: document.getElementsByName("place")[0].value, country: document.getElementsByName("country")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "ManDo"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, job: document.getElementsByName("job")[0].value, country: document.getElementsByName("country")[0].value, company: document.getElementsByName("company")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "ManSee"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, job: document.getElementsByName("job")[0].value, company: document.getElementsByName("company")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "People"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id : document.getElementsByName("id")[0].value, name: document.getElementsByName("name")[0].value, surname: document.getElementsByName("surname")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "PlaceCom"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, company: document.getElementsByName("company")[0].value, x: document.getElementsByName("x")[0].value, y: document.getElementsByName("y")[0].value, z: document.getElementsByName("z")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "PlaceDo"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {id: document.getElementsByName("id")[0].value, x: document.getElementsByName("x")[0].value, y: document.getElementsByName("y")[0].value, z: document.getElementsByName("z")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "TypesOfCompanies"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {type: document.getElementsByName("type")[0].value, description: document.getElementsByName("description")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (table === "TypesOfGadgets"){
        $.ajax({
            url: url,
            method: 'post',
            dataType: 'json',
            data: {type: document.getElementsByName("type")[0].value, description: document.getElementsByName("description")[0].value},
            success: function (data) {
                console.log("123");

            },
            error:function (jqXHR, exception) {
                if (jqXHR.status === 500) {
                    document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("result-table").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("result-table").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }
}

function unhid(table) {
    if (table === "Company"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("country")[0].removeAttribute("hidden");
        document.getElementsByName("function")[0].removeAttribute("hidden");
        document.getElementsByName("name")[0].removeAttribute("hidden");
        document.getElementsByName("type")[0].removeAttribute("hidden");
    }else if (table === "Country"){
        document.getElementsByName("country")[0].removeAttribute("hidden");
        document.getElementsByName("danger")[0].removeAttribute("hidden");
    }else if (table === "GadgetsFrom"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("model")[0].removeAttribute("hidden");
        document.getElementsByName("manDo")[0].removeAttribute("hidden");
        document.getElementsByName("placeDo")[0].removeAttribute("hidden");
        document.getElementsByName("type")[0].removeAttribute("hidden");
        document.getElementsByName("frequency")[0].removeAttribute("hidden");
    }else if (table === "GadgetsTo"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("gadgets")[0].removeAttribute("hidden");
        document.getElementsByName("place")[0].removeAttribute("hidden");
        document.getElementsByName("country")[0].removeAttribute("hidden");
    }else if (table === "ManDo"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("job")[0].removeAttribute("hidden");
        document.getElementsByName("country")[0].removeAttribute("hidden");
        document.getElementsByName("company")[0].removeAttribute("hidden");
    }else if (table === "ManSee"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("job")[0].removeAttribute("hidden");
        document.getElementsByName("company")[0].removeAttribute("hidden");
    }else if (table === "People"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("name")[0].removeAttribute("hidden");
        document.getElementsByName("surname")[0].removeAttribute("hidden");
    }else if (table === "PlaceCom"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("company")[0].removeAttribute("hidden");
        document.getElementsByName("x")[0].removeAttribute("hidden");
        document.getElementsByName("y")[0].removeAttribute("hidden");
        document.getElementsByName("z")[0].removeAttribute("hidden");
    }else if (table === "PlaceDo"){
        document.getElementsByName("id")[0].removeAttribute("hidden");
        document.getElementsByName("x")[0].removeAttribute("hidden");
        document.getElementsByName("y")[0].removeAttribute("hidden");
        document.getElementsByName("z")[0].removeAttribute("hidden");
    }else if (table === "TypesOfCompanies"){
        document.getElementsByName("type")[0].removeAttribute("hidden");
        document.getElementsByName("description")[0].removeAttribute("hidden");
    }else if (table === "TypesOfGadgets"){
        document.getElementsByName("type")[0].removeAttribute("hidden");
        document.getElementsByName("description")[0].removeAttribute("hidden");
    }
}
let datt;
function select() {
    let table = check();
    let url = "/Select/"+table;
    $.ajax({
        url: url,
        method: 'post',
        dataType: 'json',
        data: {},
        success: function(data){
            console.log(data);
            datt = data;
            let table = document.createElement("table");
            if (document.getElementById("result-table")) {
                document.getElementById("result-table").remove();
            }
            if (document.getElementById("output_data")) {
                document.getElementById("output_data").remove();
            }
            table.id = "result-table";
            let headers = document.createElement("tr");
            headers.id = "table-headers";
            let s = "";
            for (k in data[0]){
                s = s + "<th>" + k + "</th>";
            }
            headers.innerHTML = s;
            let header = document.createElement("h1");
            header.setAttribute("id", "output_data");
            header.innerText = "Вывод данных";
            document.getElementsByClassName("main")[1].appendChild(header);
            document.getElementsByClassName("main")[1].appendChild(table);
            table.appendChild(headers);
            for (let i=0; i<data.length; i++){
                let s = "";
                let row = document.createElement("tr");
                for (k in data[0]){
                    let j;
                    for (j in data[i][k]){
                        break;
                    }
                    if (typeof data[i][k] === 'object'){
                        s = s + "<td>" + data[i][k][j] + "</td>"
                    }else {
                        s = s + "<td>" + data[i][k] + "</td>";
                    }
                }
                row.innerHTML = s;
                table.appendChild(row);
            }
        },
        error:function (jqXHR, exception) {
            if (jqXHR.status === 500) {
                document.getElementById("result-table").innerText = "Проверьте правильность введенных данных";
            } else if (jqXHR.status === 404) {
                document.getElementById("result-table").innerText = "Нет ресурса по адресу "+ url;
            } else if (exception === 'timeout') {
                document.getElementById("result-table").innerText = "Время запроса вышло";
            }  else {
                document.getElementById("result-table").innerText = "Непредвиденная ошибка";
            }
        }
    });
}
