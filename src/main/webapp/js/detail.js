$(document).ready
(
    function()
    {
        getPageData(0, 8);

        getTotalPage();

        button();

        page();
    }
)
function clear()
{
    $("#0-0").val("");
    $("#0-1").val("");
    $("#0-2").val("");
    $("#0-3").val("");
    $("#0-4").val("");
    $("#0-5").val("");
    $("#0-6").val("");
    $("#0-7").val("");
}
function add()
{
    var url = "http://localhost:8080/student/data/add";

    var requestData = JSON.stringify({"studentId":$("#0-0").val(), "studentName":$("#0-1").val(), "studentGender":$("#0-2").val(), "studentAge":$("#0-3").val(), "studentGrade":$("#0-4").val(), "studentChinese":$("#0-5").val(), "studentMath":$("#0-6").val(), "studentSport":$("#0-7").val()});

    $.ajax
    (
        {
            url: url,
            type: "post",
            data: requestData,
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            success:
                function (responseData)
                {
                    result = eval(responseData);

                    alert(result.message);
                },
            error:
                function ()
                {
                    alert('前台请求页面数据失败！');
                }
        }
    );
}
function update()
{
    var url = "http://localhost:8080/student/data/update";

    var requestData = JSON.stringify({"studentId":$("#0-0").val(), "studentName":$("#0-1").val(), "studentGender":$("#0-2").val(), "studentAge":$("#0-3").val(), "studentGrade":$("#0-4").val(), "studentChinese":$("#0-5").val(), "studentMath":$("#0-6").val(), "studentSport":$("#0-7").val()});

    $.ajax
    (
        {
            url: url,
            type: "post",
            data: requestData,
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            success:
                function (responseData)
                {
                    result = eval(responseData);

                    alert(result.message);
                },
            error:
                function ()
                {
                    alert('前台请求页面数据失败！');
                }
        }
    );
}
function deleteRequest(id)
{
    var url = "http://localhost:8080/student/data/delete";

    var requestData = JSON.stringify({"studentId":id});

    $.ajax
    (
        {
            url: url,
            type: "post",
            data: requestData,
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            success:
                function (responseData)
                {
                    result = eval(responseData);

                    alert(result.message);
                },
            error:
                function ()
                {
                    alert('前台请求页面数据失败！');
                }
        }
    );
}

function button()
{
    $("#0-8").click
    (
        function()
        {
            add();
            clear();
            window.location.reload();
        }
    )
    $("#0-9").click
    (
        function()
        {
            update();
            clear();
            window.location.reload();
        }
    )
    $("#1-8").click
    (
        function()
        {
            $("#0-0").val($("#1-0").val());
            $("#0-1").val($("#1-1").val());
            $("#0-2").val($("#1-2").val());
            $("#0-3").val($("#1-3").val());
            $("#0-4").val($("#1-4").val());
            $("#0-5").val($("#1-5").val());
            $("#0-6").val($("#1-6").val());
            $("#0-7").val($("#1-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#2-8").click
    (
        function()
        {
            $("#0-0").val($("#2-0").val());
            $("#0-1").val($("#2-1").val());
            $("#0-2").val($("#2-2").val());
            $("#0-3").val($("#2-3").val());
            $("#0-4").val($("#2-4").val());
            $("#0-5").val($("#2-5").val());
            $("#0-6").val($("#2-6").val());
            $("#0-7").val($("#2-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#3-8").click
    (
        function()
        {
            $("#0-0").val($("#3-0").val());
            $("#0-1").val($("#3-1").val());
            $("#0-2").val($("#3-2").val());
            $("#0-3").val($("#3-3").val());
            $("#0-4").val($("#3-4").val());
            $("#0-5").val($("#3-5").val());
            $("#0-6").val($("#3-6").val());
            $("#0-7").val($("#3-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#4-8").click
    (
        function()
        {
            $("#0-0").val($("#4-0").val());
            $("#0-1").val($("#4-1").val());
            $("#0-2").val($("#4-2").val());
            $("#0-3").val($("#4-3").val());
            $("#0-4").val($("#4-4").val());
            $("#0-5").val($("#4-5").val());
            $("#0-6").val($("#4-6").val());
            $("#0-7").val($("#4-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#5-8").click
    (
        function()
        {
            $("#0-0").val($("#5-0").val());
            $("#0-1").val($("#5-1").val());
            $("#0-2").val($("#5-2").val());
            $("#0-3").val($("#5-3").val());
            $("#0-4").val($("#5-4").val());
            $("#0-5").val($("#5-5").val());
            $("#0-6").val($("#5-6").val());
            $("#0-7").val($("#5-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#6-8").click
    (
        function()
        {
            $("#0-0").val($("#6-0").val());
            $("#0-1").val($("#6-1").val());
            $("#0-2").val($("#6-2").val());
            $("#0-3").val($("#6-3").val());
            $("#0-4").val($("#6-4").val());
            $("#0-5").val($("#6-5").val());
            $("#0-6").val($("#6-6").val());
            $("#0-7").val($("#6-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#7-8").click
    (
        function()
        {
            $("#0-0").val($("#7-0").val());
            $("#0-1").val($("#7-1").val());
            $("#0-2").val($("#7-2").val());
            $("#0-3").val($("#7-3").val());
            $("#0-4").val($("#7-4").val());
            $("#0-5").val($("#7-5").val());
            $("#0-6").val($("#7-6").val());
            $("#0-7").val($("#7-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )
    $("#8-8").click
    (
        function()
        {
            $("#0-0").val($("#8-0").val());
            $("#0-1").val($("#8-1").val());
            $("#0-2").val($("#8-2").val());
            $("#0-3").val($("#8-3").val());
            $("#0-4").val($("#8-4").val());
            $("#0-5").val($("#8-5").val());
            $("#0-6").val($("#8-6").val());
            $("#0-7").val($("#8-7").val());

            $("#0-8").attr("disabled", true);
            $("#0-9").attr("disabled", false);
        }
    )

    $("#1-9").click
    (
        function()
        {
            var id = $("#1-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#2-9").click
    (
        function()
        {
            var id = $("#2-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#3-9").click
    (
        function()
        {
            var id = $("#3-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#4-9").click
    (
        function()
        {
            var id = $("#4-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#5-9").click
    (
        function()
        {
            var id = $("#5-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#6-9").click
    (
        function()
        {
            var id = $("#6-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#7-9").click
    (
        function()
        {
            var id = $("#7-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
    $("#8-9").click
    (
        function()
        {
            var id = $("#8-0").val();

            if(confirm("确定要删除编号["+id+"]的学生数据吗？"))
            {
                deleteRequest(id);

                window.location.reload();
            }
        }
    )
}

function getTotalPage()
{
    var url = "http://localhost:8080/student/data/page";

    var requestData = JSON.stringify({start:1});

    $.ajax
    (
        {
            url: url,
            type: "post",
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            success:
                function (responseData)
                {
                    result = eval(responseData);

                    if(result.message == "success")
                    {
                        var totalPage = 0;

                        if(Number(result.data)%8 == 0)
                        {
                            totalPage = Number(result.data)/8;
                        }
                        else
                        {
                            totalPage = Number(result.data)/8 + 1;
                        }

                        $("#totalPage")[0].innerHTML = parseInt(totalPage);
                    }
                    else
                    {
                        alert(result.message);
                    }
                },
            error:
                function ()
                {
                    alert('前台请求页面数据失败！');
                }
        }
    );
}

function getPageData(startValue, countValue)
{
    var url = "http://localhost:8080/student/data/detail";

    var requestData = JSON.stringify({start:startValue, count:countValue});

    $.ajax
    (
        {
            url: url,
            type: "post",
            data: requestData,
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            success:
                function (responseData)
                {
                    result = eval(responseData);

                    if(result.message == "success")
                    {
                        $("[type='text']").val("");
                        fillData(result.data);
                    }
                    else
                    {
                        alert(result.message);
                    }
                },
            error:
                function ()
                {
                    alert('前台请求页面数据失败！');
                }
        }
    );
}

function fillData(data)
{
    for(var i = 1; i <= 8; i++)
    {
        $("#"+String(i)+"-0").val(data[i-1].studentId);
        $("#"+String(i)+"-1").val(data[i-1].studentName);
        $("#"+String(i)+"-2").val(data[i-1].studentGender);
        $("#"+String(i)+"-3").val(data[i-1].studentAge);
        $("#"+String(i)+"-4").val(data[i-1].studentGrade);
        $("#"+String(i)+"-5").val(data[i-1].studentChinese);
        $("#"+String(i)+"-6").val(data[i-1].studentMath);
        $("#"+String(i)+"-7").val(data[i-1].studentSport);

        if(data.length >= i)
        {
            $("#"+String(i)+"-8").attr("disabled", false);
            $("#"+String(i)+"-9").attr("disabled", false);
        }
    }
}

function page()
{
    $("#homePage").click
    (
        function()
        {
            getPageData(0, 8);

            $("#currentPage")[0].innerHTML = 1;
        }
    )
    $("#endPage").click
    (
        function()
        {
            var number = $("#totalPage")[0].innerHTML;

            getPageData((number - 1)*8, 8);

            $("#currentPage")[0].innerHTML = number;
        }
    )
    $("#previousPage").click
    (
        function()
        {
            var number = parseInt($("#currentPage")[0].innerHTML) - 1;

            if(number <= 0)
            {

            }
            else
            {
                getPageData((number - 1)*8, 8);

                $("#currentPage")[0].innerHTML = number;
            }
        }
    )
    $("#nextPage").click
    (
        function()
        {
            var number = parseInt($("#currentPage")[0].innerHTML) + 1;

            if(number > $("#totalPage")[0].innerHTML)
            {

            }
            else
            {
                getPageData((number - 1)*8, 8);

                $("#currentPage")[0].innerHTML = number;
            }
        }
    )
}
