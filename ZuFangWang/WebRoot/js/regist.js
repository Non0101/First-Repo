		$(function(){
				
				$("#txtEmail").blur(function(){
					if($("#txtEmail").val().length==0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email不能为空");
					}else if($("#txtEmail").val().length>30){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("您输入的Email过长");
					}else if($("#txtEmail").val().indexOf("@")<0||$("#txtEmail").val().indexOf(".com")<0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email格式错误");
					}else{
						$("#emailimg").prop("src","../images/right.gif");
						$("#emailinfo").text("Email格式正确").css("color","black");					
					}
				});
				$("#txtNickName").blur(function(){
					if($("#txtNickName").val().length==0){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("昵称不能为空");
					}else if($("#txtNickName").val().length>20||$("#txtNickName").val().length<4){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("昵称长度不符合要求");
					}else{
						$("#nameimg").prop("src","../images/right.gif");
						$("#nameinfo").css("color","black").text("昵称格式正确");					
					}
				});
				$("#txtPassword").blur(function(){
					if($("#txtPassword").val().length==0){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("密码不能为空");
					}else if($("#txtPassword").val().length>20||$("#txtPassword").val().length<6){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("密码长度不符合要求");
					}else{
						$("#passwordimg").prop("src","../images/right.gif");
						$("#passwordinfo").css("color","black").text("密码格式正确");					
					}
				});
				$("#txtRepeatPass").blur(function(){
					if($("#txtRepeatPass").val()!=$("#txtPassword").val()){
						$("#password1img").prop("src","../images/wrong.gif");
						$("#password1info").css("color","red").text("两次输入的密码不同");
					}else{
						$("#password1img").prop("src","../images/right.gif");
						$("#password1info").css("color","black").text("正确");
					}
				});
				$("#btnClientRegister1").click(function(){
					if($("#txtEmail").val().length==0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email不能为空");
						return false;
					}else if($("#txtEmail").val().length>30){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("您输入的Email过长");
						return false;
					}else if($("#txtEmail").val().indexOf("@")<0||$("#txtEmail").val().indexOf(".com")<0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email格式错误");
						return false;
					}else if($("#txtNickName").val().length==0){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("昵称不能为空");
						return false;
					}else if($("#txtNickName").val().length>20||$("#txtNickName").val().length<4){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("昵称长度不符合要求");
						return false;
					}else if($("#txtPassword").val().length==0){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("密码不能为空");
						return false;
					}else if($("#txtPassword").val().length>20||$("#txtPassword").val().length<6){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("密码长度不符合要求");
						return false;
					}else if($("#txtRepeatPass").val()!=$("#txtPassword").val()){
						$("#password1img").prop("src","../images/wrong.gif");
						$("#password1info").css("color","red").text("两次输入的密码不同");
						return false;
					}else
				$("#form1").submit();
				});

			});