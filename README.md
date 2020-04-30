# cordova-plugin-rkmsnc-mytoast
Adds Toast support

declare var MyToast: any;

var myToast = new MyToast();
myToast.showToast("Hello world!", {},
    (success) => {
        console.log(success);
    },
    (error) => {
        console.log(error);
    }
);