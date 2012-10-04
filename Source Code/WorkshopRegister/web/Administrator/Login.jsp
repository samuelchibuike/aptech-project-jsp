<%-- 
    Document   : Login
    Created on : Oct 1, 2012, 12:35:59 PM
    Author     : ANHDUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
        <link rel="stylesheet" type="text/css" href="../resources/Css/Login.css"/>
        <script type="text/javascript">
            function checkData(){
                //alert("fuck");
                //return window.location = "AdminForm.jsp";                
            }
        </script>
    </head>
    <body>        
        <h1>Chạy Dân Đi Em :))</h1> 
        <div id="container_header">
            <div id="header">
                <div id="header_icon">
                    <img src="../resources/Images/admin_icon.jpg" alt="" />
                </div> <!-- end header_icon-->                
                <div id="header_text">
                    Manager System
                </div> <!-- end header_text-->                
            </div> <!-- end header-->           
        </div> <!-- end container_header-->     
        
         
        <div id="container_main">
            <div id="main">
                <div id="icon_left">
                    <img src="../resources/Images/login_icon.jpg" width="100%" height="100%" alt="" />
                </div> <!-- end icon_left-->
                <div id="right_login_form">        
                    <div style="margin-top:95px;margin-left:20px;">                        
                        <form action="">                            
                            <table width="100%" align="center" border="0" cellpadding="5" cellspacing="5">
                                <tr>
                                    <td width="100px" align="right"><div id="font1">User Name</div></td>
                                    <td width="100px"><input type="text" id="tbx_uName" class="tbx_uName" /></td>
                                    <td>                                           </td>
                                </tr>
                                <tr>
                                    <td align="right"><div id="font1">Password</div></td>
                                    <td><input type="text" id="tbx_uPass" class="tbx_uPass" /></asp:TextBox></td>
                                    <td></td>
                                </tr>                             
                                <tr> 
                                    <td></td>                                
                                    <td align="right"><input type="checkbox" id="cbx_save" class="cbx_save" /> </td>
                                    <td></td>
                                </tr>                               
                                <tr>
                                    <td></td>
                                    <td colspan="2">
                                        <input type="submit" value="Login" onclick="return checkData();" />                                      
                                        <input type="reset" value="Cancel" />
                                    </td>                             
                                </tr>
                            </table>  
                        </form>      
                    </div>                                           
                </div> <!-- end right_login_form-->
            </div> <!-- end main-->               
        </div> <!-- end container_main-->

         <div id="container_footer">
         </div> <!-- end container_footer-->
        
    </body>
</html>
