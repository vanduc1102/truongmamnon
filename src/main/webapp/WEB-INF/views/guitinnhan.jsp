<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>eSMS.vn - SMS API, SMS Marketing</title>
</head>
<body>
<div id="content">
    <div id="content-left">
      <fieldset>
        <legend>&nbsp;Demo gửi tin nhắn sử dụng API của eSMS.vn &nbsp;</legend>
    
        <div id="page"></div>
    <div id="0.5082064777270441"></div>
    <table style="width: 100%">
    <tbody><tr>
    <td style="border:1px solid #090">
    
    <table style="width: 100%">
	    <tbody>
            <tr>
                <td style="width: 100%">
                    <img style="text-align:center" width="200" src="http://esms.vn/Content/FrontEnd/img/logo/nhantinlogo.png" alt="eSMS.vn Logo" />
                </td>
            </tr>
            <tr>
		        <td valign="top" style="border-bottom:1px solid #000;padding-left:12px;text-align:left;">
                    <p class="desc">
                        Đây là giao diện demo việc sử dụng API của eSMS.vn để gửi tin nhắn đến một hoặc nhiều số điện thoại<br />
                        Chi tiết cách sử dụng các bạn có thể tham khảo thêm bài hướng dẫn tại <a href="http://esms.vn/blog/3-buoc-de-co-the-gui-tin-nhan-tu-website-ung-dung-cua-ban-bang-sms-api-cua-esmsvn">http://esms.vn/blog/3-buoc-de-co-the-gui-tin-nhan-tu-website-ung-dung-cua-ban-bang-sms-api-cua-esmsvn</a>
                    </p>
		        </td>
	        </tr>
	        <tr>
		        <td>
                    <div style="padding:5px; position: absolute; display: none; z-index: 100" name="smsPreview" id="smsPreview">
                        <table width="177" cellspacing="0" cellpadding="0" border="0">
                         <tbody>
                  <tr>
                    <td style="background: url(/images/r1.gif) no-repeat;height:43px;width:177px;"><p style="text-align:right;padding-right:10px;"><a style="color:#fff" onclick="document.getElementById('smsPreview').style.display='none'" href="javascript:;">close</a></p></td>
                  </tr>
                  <tr>
                   <td style="background: url(/images/r2.gif) no-repeat;height:205px;width:177px;padding:0 12px"><textarea contenteditable="false" serif;"="" roman",="" new="" times="" style="border: none;overflow-x: hidden; overflow-y:hidden;width: 150px;height:196px;background-color: #fff;font-family: Georgia, " disabled="disabled" wrap="on" cols="16" rows="12" id="smsprev"></textarea></td>
                  </tr>
                  <tr>
                <td style="background: url(/images/r3.gif) no-repeat;height:58px;width:177px;"></td>
                  </tr>
                </tbody>
                        </table>
                    </div>
                </td>
	        </tr>
	        <tr>
		        <td valign="top">
		           
                    <form autocomplete="off"  method="post" action="send" id="smsform">
                        <table style="width:100%">
                    <tbody>
              
                       <tr>
                           <td align="center" colspan="2"><!-- Leaderboard (728 x 90) --></td>
                       </tr>
                        <tr>
                         <td align="center" colspan="2"><div id="errormsg"></div></td>

                        </tr>
                       <tr>
                         <td valign="top" style="text-align:right;width:30%"><strong>Gửi đến:</strong></td>
                         <td style="border-left:10px solid #fff;">
                                <input style="width:200px" type="text" name="phone" placeholder="Nhập số điện thoại"/>
                         </td>
                        </tr>
                      <tr>
                        <td valign="top" style="text-align:right"><strong>Nội dung:</strong></td>
                        <td valign="top" style="border-left:10px solid #fff;"><textarea  onblur="setbg('#f0f5e6',this.id)" onfocus="setbg('#d9ffd9',this.id);" maxlength="160" name="message" id="message" style="background: none repeat scroll 0% 0% rgb(240, 245, 230);"></textarea><br>
            
                            </td>
                      </tr>

                      <tr>
                          <td align="center" ><!-- Leaderboard (728 x 90) --></td>
                          <td style="border-left:10px solid #fff;">
                              <input type="submit"  value="Send" id="submit"><br><br></td>

                      </tr>    

                   </tbody>

                </table>
                    </form>
                </td>
	        </tr>
        </tbody>
    </table>
    </td>
    </tr>
    </tbody></table>
      </fieldset>
    </div>

</div>
© 2013 <a href="http://esms.vn">eSMS.vn</a>
</body>
</html>