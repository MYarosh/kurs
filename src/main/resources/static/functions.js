var dattt;
function check(){
    let table;
    let radios = document.getElementsByName("table");
    for (let i=0; i < radios.length; i++){
        if (radios[i].checked){
            table = radios[i].value;
        }
    }
    return table;
}
function dothis() {
    let func = check();
    if (!document.getElementById("x").value){
        document.getElementById("x").value = 0;
    }
    if (!document.getElementById("y").value){
        document.getElementById("y").value = 0;
    }
    if (!document.getElementById("z").value){
        document.getElementById("z").value = 0;
    }
    if (func === "thirst"){
        $.ajax({
            url: '/Func/thirst',
            method: 'post',
            dataType: 'json',
            data: {},
            success: function (data) {
                console.log(data);
                dattt = data;
                for (k in data["content"][0]){
                    console.log(data["content"][0][k]);
                }
                let table = document.createElement("table");
                if (document.getElementById("answer")) {
                    document.getElementById("answer").remove();
                }
                table.id = "answer";
                let headers = document.createElement("tr");
                headers.id = "table-headers";
                let s = "";
                s = s + "<th>Страна</th><th>Количество устройств</th>";
                headers.innerHTML = s;
                document.getElementById("result").appendChild(table);
                table.appendChild(headers);
                let st = "";
                let row = document.createElement("tr");
                for (k in data["content"][0]) {
                    st = st + "<td>" + data["content"][0][k] + "</td>";
                }
                row.innerHTML = st;
                table.appendChild(row);

            },error:function (jqXHR, exception) {
                let table = document.createElement("p");
                if (document.getElementById("answer")) {
                    document.getElementById("answer").remove();
                }
                table.id = "answer";
                document.getElementById("result").appendChild(table);
                if (jqXHR.status === 500) {
                    document.getElementById("answer").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("answer").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("answer").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("answer").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }else if (func === "second"){
        $.ajax({
            url: '/Func/second',
            method: 'post',
            dataType: 'json',
            data: {x: document.getElementById("x").value, y: document.getElementById("y").value, z: document.getElementById("z").value},
            success: function (data) {
                if (document.getElementById("answer")){
                    document.getElementById("result").removeChild(document.getElementById("answer"));
                }
                let p = document.createElement("p");
                p.id = "answer";
                p.innerHTML = "<h1 style='color: white'>"+data+"</h1>";
                document.getElementById("result").appendChild(p);
            },error:function (jqXHR, exception) {
                let table = document.createElement("p");
                if (document.getElementById("answer")) {
                    document.getElementById("answer").remove();
                }
                table.id = "answer";
                document.getElementById("result").appendChild(table);
                if (jqXHR.status === 500) {
                    document.getElementById("answer").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("answer").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("answer").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("answer").innerText = "Непредвиденная ошибка";
                }
            }
        });
    } else if (func === "third"){
        $.ajax({
            url: '/Func/third',
            method: 'post',
            dataType: 'json',
            data: {x: document.getElementById("x").value, y: document.getElementById("y").value, z: document.getElementById("z").value},
            success: function (data) {
                console.log(data);
                dattt = data;
                let table = document.createElement("table");
                if (document.getElementById("answer")) {
                    document.getElementById("answer").remove();
                }
                table.id = "answer";
                let headers = document.createElement("tr");
                headers.id = "table-headers";
                let s = "";
                s = s + "<th>Модель</th><th>Тип</th><th>Частота</th>";
                headers.innerHTML = s;
                document.getElementById("result").appendChild(table);
                table.appendChild(headers);
                for (let i=0; i<data.length; i++){
                    let s = "";
                    let row = document.createElement("tr");
                    for (k in data[0]){
                        s = s + "<td>" + data[i][k] + "</td>";
                    }
                    row.innerHTML = s;
                    table.appendChild(row);
                }
            },error:function (jqXHR, exception) {
                let table = document.createElement("p");
                if (document.getElementById("answer")) {
                    document.getElementById("answer").remove();
                }
                table.id = "answer";
                document.getElementById("result").appendChild(table);
                if (jqXHR.status === 500) {
                    document.getElementById("answer").innerText = "Проверьте правильность введенных данных";
                } else if (jqXHR.status === 404) {
                    document.getElementById("answer").innerText = "Нет ресурса по адресу "+ url;
                } else if (exception === 'timeout') {
                    document.getElementById("answer").innerText = "Время запроса вышло";
                }  else {
                    document.getElementById("answer").innerText = "Непредвиденная ошибка";
                }
            }
        });
    }
}
