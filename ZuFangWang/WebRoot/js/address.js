		$(function(){
				$("#receiveName").blur(function(){
					if($("#receiveName").val().length==0){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("姓名不能为空");
					}else if($("#receiveName").val().length>10){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("您输入的姓名过长");
					}else{
						$("#nameimg1").prop("src","../images/right.gif");
						$("#nameinfo1").text("姓名格式正确").css("color","black");					
					}
				});
				$("#fullAddress").blur(function(){
					if($("#fullAddress").val().length==0){
						$("#emailimg1").prop("src","../images/wrong.gif");
						$("#emailinfo1").css("color","red").text("地址不能为空");
					}else{
						$("#emailimg1").prop("src","../images/right.gif");
						$("#emailinfo1").css("color","black").text("地址格式正确");					
					}
				});
				$("#postalCode").blur(function(){
					if($("#postalCode").val().length==0){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("邮政编码不能为空");
					}else if($("#postalCode").val().length!=6){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("长度不符合要求");
					}else if(isNaN($("#postalCode").val())){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("必须为纯数字");
					}else{
						$("#codeimg1").prop("src","../images/right.gif");
						$("#codeinfo1").css("color","black").text("格式正确");					
					}
				});
				$("#phone").blur(function(){
					if($("#phone").val().length!=11||isNaN($("#phone").val())){
						$("#phoneimg1").prop("src","../images/wrong.gif");
						$("#phoneinfo1").css("color","red").text("必须为11位纯数字");
					}else{
						$("#phoneimg1").prop("src","../images/right.gif");
						$("#phoneinfo1").css("color","black").text("正确");
					}
				});
				$("#mobile").blur(function(){
					if($("#mobile").val().length!=11||isNaN($("#mobile").val())){
						$("#mobileimg1").prop("src","../images/wrong.gif");
						$("#mobileinfo1").css("color","red").text("必须为11位纯数字");
					}else{
						$("#mobileimg1").prop("src","../images/right.gif");
						$("#mobileinfo1").css("color","black").text("正确");
					}
				});

				$("#btnClientRegister1").click(function(){
					if($("#receiveName").val().length==0){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("姓名不能为空");
						return false;
					}else if($("#receiveName").val().length>10){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("您输入的姓名过长");
						return false;
					}else if($("#fullAddress").val().length==0){
						$("#emailimg1").prop("src","../images/wrong.gif");
						$("#emailinfo1").css("color","red").text("地址不能为空");
						return false;
					}else if($("#postalCode").val().length==0){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("邮政编码不能为空");
						return false;
					}else if($("#postalCode").val().length!=6){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("长度不符合要求");
						return false;
					}else if(isNaN($("#postalCode").val())){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("必须为纯数字");
						return false;
					}else if($("#phone").val().length!=11||isNaN($("#phone").val())){
						$("#phoneimg1").prop("src","../images/wrong.gif");
						$("#phoneinfo1").css("color","red").text("必须为11位纯数字");
						return false;
					}else if($("#mobile").val().length!=11||isNaN($("#mobile").val())){
						$("#mobileimg1").prop("src","../images/wrong.gif");
						$("#mobileinfo1").css("color","red").text("必须为11位纯数字");
						return false;
					}else
				$("#form1").submit();
				});

			});