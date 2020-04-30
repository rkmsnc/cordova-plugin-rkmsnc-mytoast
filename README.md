# cordova-plugin-rkmsnc-mytoast
Adds Toast support

<code>
    declare var MyToast: any;

var myToast = new MyToast();

myToast.showToast("Hello world!", {},

    (success) => {
<br />
        console.log(success);
<br />
    },
<br />
    (error) => {
<br />
        console.log(error);
<br />
    }
<br />
);
<br />
</code>
