<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
    let register_form = {
        init: function () {
            $('#register_btn').addClass('disabled');

            $("#register_btn").click(function () {
                register_form.send();
            });
            $('#name').keyup(function () {
                var id = $('#id').val();
                var pwd = $('#pwd').val();
                var name = $('#name').val();
                if (id != '' && pwd != '' && name != '') {
                    $('#register_btn').removeClass('disabled');
                }
            });

            $('#id').keyup(function () {
                var txt_id = $(this).val();
                if (txt_id.length <= 3) {
                    return;
                }
                $.ajax({
                    url: '/checkid',
                    data: {id: txt_id},
                    success: function (result) {
                        if (result == 0) {
                            $('#check_id').text('사용가능합니다.');
                        } else {
                            $('#check_id').text('사용불가능합니다.')
                        }
                    }
                });
            });
        },
        send: function () {
            var id = $('#id').val();
            var pwd = $('#pwd').val();
            var name = $('#name').val();
            if (id.length <= 3) {
                $('#check_id').text('4자리 이상이어야 합니다.');
                $('#id').focus();
                return;
            }
            if (pwd == '') {
                $('#pwd').focus();
                return;
            }
            if (name == '') {
                $('#name').focus();
                return;
            }
            $("#register_form").attr({
                "action": "/registerimpl",
                "method": "post"
            });
            $("#register_form").submit();
        }
    }

    $(function () {
        register_form.init();
    });
</script>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Register Page</h1>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Register Page</h6>
        </div>
        <div class="card-body">
            <div id="container">
                <div class="col-sm-8 text-left">
                    <div class="container">
                        <form id="register_form" class="">
                            <div class="container">
                                <p>Please fill in this form to create an account.</p>
                                <hr>

                                <label for="id"><b>ID</b></label>
                                <input type="text" placeholder="Enter ID" name="id" id="id" required>

                                <div>
                                    <span id="check_id" class="bg-danger"></span>
                                </div>

                                <label for="pwd"><b>Password</b></label>
                                <input type="password" placeholder="Enter Password" name="pwd" id="pwd" required>

                                <label for="lev"><b>Level</b></label>
                                <input type="text" placeholder="Enter Level" name="lev" id="lev" required>
                                <hr>

                                <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
                                <button id="register_btn" type="button" class="registerbtn">Register</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

<style>
    * {
        box-sizing: border-box
    }

    /* Add padding to containers */
    .container {
        padding: 16px;
        width: 100%;
        height: 100%;
    }

    /* Full-width input fields */
    input[type=text], input[type=password] {
        width: 100%;
        padding: 15px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
    }

    input[type=text]:focus, input[type=password]:focus {
        background-color: #ddd;
        outline: none;
    }

    /* Overwrite default styles of hr */
    hr {
        border: 1px solid #f1f1f1;
        margin-bottom: 25px;
    }

    /* Set a style for the submit/register button */
    .registerbtn {
        background-color: #04AA6D;
        color: white;
        padding: 16px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
        opacity: 0.9;
    }

    .registerbtn:hover {
        opacity: 1;
    }

    /* Add a blue text color to links */
    a {
        color: dodgerblue;
    }

    /* Set a grey background color and center the text of the "sign in" section */
    .signin {
        background-color: #f1f1f1;
        text-align: center;
    }
</style>