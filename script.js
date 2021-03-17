var myApp = angular.module('myApp', []);

myApp.controller('ctrl1', function ($scope, $http) {
    console.log("controller");

      
    
            fetch('https://paytmlogolink.s3.ap-south-1.amazonaws.com/paytmlink.json', {
                method: 'get'
            })
            .then(response => response.json())
            .then(function(jsonData) {
                console.log(jsonData);
                document.getElementById('merchantcompanyname').innerHTML=jsonData.companyName;
              document.getElementById('merchantlogourl').src= "https://paymentslink-merchant-logos.s3.ap-south-1.amazonaws.com/logos/vilogo.jpeg";
                
                document.getElementById('paytmlogolink').src="https://paymentslink-merchant-logo.s3.ap-south-1.amazonaws.com/logos/paytm_logo.png";
                })
            .catch(err => {
                    alert("file not found");
                })
                

}
)


