		$(function(){
				
				$("#txtEmail").blur(function(){
					if($("#txtEmail").val().length==0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email����Ϊ��");
					}else if($("#txtEmail").val().length>30){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("�������Email����");
					}else if($("#txtEmail").val().indexOf("@")<0||$("#txtEmail").val().indexOf(".com")<0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email��ʽ����");
					}else{
						$("#emailimg").prop("src","../images/right.gif");
						$("#emailinfo").text("Email��ʽ��ȷ").css("color","black");					
					}
				});
				$("#txtNickName").blur(function(){
					if($("#txtNickName").val().length==0){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("�ǳƲ���Ϊ��");
					}else if($("#txtNickName").val().length>20||$("#txtNickName").val().length<4){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("�ǳƳ��Ȳ�����Ҫ��");
					}else{
						$("#nameimg").prop("src","../images/right.gif");
						$("#nameinfo").css("color","black").text("�ǳƸ�ʽ��ȷ");					
					}
				});
				$("#txtPassword").blur(function(){
					if($("#txtPassword").val().length==0){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("���벻��Ϊ��");
					}else if($("#txtPassword").val().length>20||$("#txtPassword").val().length<6){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("���볤�Ȳ�����Ҫ��");
					}else{
						$("#passwordimg").prop("src","../images/right.gif");
						$("#passwordinfo").css("color","black").text("�����ʽ��ȷ");					
					}
				});
				$("#txtRepeatPass").blur(function(){
					if($("#txtRepeatPass").val()!=$("#txtPassword").val()){
						$("#password1img").prop("src","../images/wrong.gif");
						$("#password1info").css("color","red").text("������������벻ͬ");
					}else{
						$("#password1img").prop("src","../images/right.gif");
						$("#password1info").css("color","black").text("��ȷ");
					}
				});
				$("#btnClientRegister1").click(function(){
					if($("#txtEmail").val().length==0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email����Ϊ��");
						return false;
					}else if($("#txtEmail").val().length>30){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("�������Email����");
						return false;
					}else if($("#txtEmail").val().indexOf("@")<0||$("#txtEmail").val().indexOf(".com")<0){
						$("#emailimg").prop("src","../images/wrong.gif");
						$("#emailinfo").css("color","red").text("Email��ʽ����");
						return false;
					}else if($("#txtNickName").val().length==0){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("�ǳƲ���Ϊ��");
						return false;
					}else if($("#txtNickName").val().length>20||$("#txtNickName").val().length<4){
						$("#nameimg").prop("src","../images/wrong.gif");
						$("#nameinfo").css("color","red").text("�ǳƳ��Ȳ�����Ҫ��");
						return false;
					}else if($("#txtPassword").val().length==0){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("���벻��Ϊ��");
						return false;
					}else if($("#txtPassword").val().length>20||$("#txtPassword").val().length<6){
						$("#passwordimg").prop("src","../images/wrong.gif");
						$("#passwordinfo").css("color","red").text("���볤�Ȳ�����Ҫ��");
						return false;
					}else if($("#txtRepeatPass").val()!=$("#txtPassword").val()){
						$("#password1img").prop("src","../images/wrong.gif");
						$("#password1info").css("color","red").text("������������벻ͬ");
						return false;
					}else
				$("#form1").submit();
				});

			});