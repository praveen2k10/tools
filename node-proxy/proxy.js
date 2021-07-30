const ProxyServer = require('transparent-proxy');

const authserver = new ProxyServer({
    auth: function (username, password) {
        return username === 'proxy-user' && password === 'proxy-pass';
    },
	upstream: function () {
          return '<upstream-proxy>:8080'; // upstream to other proxy
    },
	verbose:true
});


const server = new ProxyServer({
	upstream: function () {
          return '<upstream-proxy>:8080'; // upstream to other proxy
    },
	verbose:true
});


//starting server on port 8080
authserver.listen(8080, '0.0.0.0', function () {
    console.log('TCP-Proxy-Server started!', authserver.address());
});

//starting server on port 8080
server.listen(8082, '0.0.0.0', function () {
    console.log('TCP-Proxy-Server started!', server.address());
});
