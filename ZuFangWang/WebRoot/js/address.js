		$(function(){
				$("#receiveName").blur(function(){
					if($("#receiveName").val().length==0){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("��������Ϊ��");
					}else if($("#receiveName").val().length>10){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("���������������");
					}else{
						$("#nameimg1").prop("src","../images/right.gif");
						$("#nameinfo1").text("������ʽ��ȷ").css("color","black");					
					}
				});
				$("#fullAddress").blur(function(){
					if($("#fullAddress").val().length==0){
						$("#emailimg1").prop("src","../images/wrong.gif");
						$("#emailinfo1").css("color","red").text("��ַ����Ϊ��");
					}else{
						$("#emailimg1").prop("src","../images/right.gif");
						$("#emailinfo1").css("color","black").text("��ַ��ʽ��ȷ");					
					}
				});
				$("#postalCode").blur(function(){
					if($("#postalCode").val().length==0){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("�������벻��Ϊ��");
					}else if($("#postalCode").val().length!=6){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("���Ȳ�����Ҫ��");
					}else if(isNaN($("#postalCode").val())){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("����Ϊ������");
					}else{
						$("#codeimg1").prop("src","../images/right.gif");
						$("#codeinfo1").css("color","black").text("��ʽ��ȷ");					
					}
				});
				$("#phone").blur(function(){
					if($("#phone").val().length!=11||isNaN($("#phone").val())){
						$("#phoneimg1").prop("src","../images/wrong.gif");
						$("#phoneinfo1").css("color","red").text("����Ϊ11λ������");
					}else{
						$("#phoneimg1").prop("src","../images/right.gif");
						$("#phoneinfo1").css("color","black").text("��ȷ");
					}
				});
				$("#mobile").blur(function(){
					if($("#mobile").val().length!=11||isNaN($("#mobile").val())){
						$("#mobileimg1").prop("src","../images/wrong.gif");
						$("#mobileinfo1").css("color","red").text("����Ϊ11λ������");
					}else{
						$("#mobileimg1").prop("src","../images/right.gif");
						$("#mobileinfo1").css("color","black").text("��ȷ");
					}
				});

				$("#btnClientRegister1").click(function(){
					if($("#receiveName").val().length==0){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("��������Ϊ��");
						return false;
					}else if($("#receiveName").val().length>10){
						$("#nameimg1").prop("src","../images/wrong.gif");
						$("#nameinfo1").css("color","red").text("���������������");
						return false;
					}else if($("#fullAddress").val().length==0){
						$("#emailimg1").prop("src","../images/wrong.gif");
						$("#emailinfo1").css("color","red").text("��ַ����Ϊ��");
						return false;
					}else if($("#postalCode").val().length==0){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("�������벻��Ϊ��");
						return false;
					}else if($("#postalCode").val().length!=6){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("���Ȳ�����Ҫ��");
						return false;
					}else if(isNaN($("#postalCode").val())){
						$("#codeimg1").prop("src","../images/wrong.gif");
						$("#codeinfo1").css("color","red").text("����Ϊ������");
						return false;
					}else if($("#phone").val().length!=11||isNaN($("#phone").val())){
						$("#phoneimg1").prop("src","../images/wrong.gif");
						$("#phoneinfo1").css("color","red").text("����Ϊ11λ������");
						return false;
					}else if($("#mobile").val().length!=11||isNaN($("#mobile").val())){
						$("#mobileimg1").prop("src","../images/wrong.gif");
						$("#mobileinfo1").css("color","red").text("����Ϊ11λ������");
						return false;
					}else
				$("#form1").submit();
				});

			});