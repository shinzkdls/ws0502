let login_form = {
    init: function () {
        $("#login_btn").click(function () {
            login_form.send();
        });
    },
    send: function () {
        $("#login_form").attr({
            "action": "/loginimpl",
            "method": "post"
        });
        $("#login_form").submit();
    }
}


let jsp01 = {
    data: 0,
    init: function (num) {
        this.data = num;
        this.display();
    },
    display: function () {
        $('#jsp01').text(this.data + '');
    }
}; // JSON