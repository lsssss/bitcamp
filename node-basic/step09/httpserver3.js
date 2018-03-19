const http = require('http')

const server = http.createServer(function(req, resp){
	resp.writeHead(
			'200',/*응답 상태 코드*/
			{	/*응답 헤더*/
				'Content-Type' : 'application/json;charset=UTF-8',
				'Access-Control-Allow-Origin': '*'
			});
	
	resp.write('{"message": "자바100기"}');
	resp.end();
});


server.listen(8888,function(){
	console.log("서버 실행 중...");
});
