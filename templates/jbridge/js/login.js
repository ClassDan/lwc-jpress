$(document).ready(function () {
    initAutoAjaxSubmit();
});

function initAutoAjaxSubmit() {
    $('.autoAjaxSubmit').on('submit', function () {
        var validateFunction = $(this).attr('data-val-function');
        if (validateFunction && !eval(validateFunction)()) {
            return false;
        }
        var okFunction = $(this).attr('data-ok-function');
        var okHref = $(this).attr('data-ok-href');
        var okMessage = $(this).attr('data-ok-message');

        var failFunction = $(this).attr('data-fail-function');
        var failMessage = $(this).attr('data-fail-message');


        $(this).ajaxSubmit({
            type: "post",
            success: function (result) {
                if (result.state == "ok") {
                    if (okFunction) {
                        eval(okFunction)(result);
                        return;
                    }

                    if (okHref) {
                        location.href = okHref;
                        return
                    }

                    if (okMessage) {
                        if (typeof toastr != "undefined") {
                            toastr.success(okMessage);
                        } else {
                            alert(okMessage);
                        }
                        return;
                    }

                    location.reload();

                }
                //fail
                else {
                    if (failFunction) {
                        eval(failFunction)(result);
                        return;
                    }

                    if (failMessage) {
                        showErrorMessage(failMessage);
                        return
                    }

                    if (result.message) {
                        showErrorMessage(result.message);
                    } else {
                        showErrorMessage('操作失败。')
                    }
                }
            },
            error: function () {
                showErrorMessage('系统错误，请稍后重试。');
            }
        });

        return false;
    });
}

function showErrorMessage(msg) {
    if (typeof toastr != "undefined") {
        toastr.error(msg, '操作失败');
    } else {
        alert(msg);
    }
}

