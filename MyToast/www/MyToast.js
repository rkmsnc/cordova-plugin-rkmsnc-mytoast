var exec = cordova.require('cordova/exec');

class MyToast {
    constructor() {
        console.log('MyToast instanced');
    }
    showToast(message, duration, success, error) {
        exec(success, error, 'MyToast', 'showToast', [message,duration]);
    }
}


if (typeof module != 'undefined' && module.exports) {
    module.exports = MyToast;
}