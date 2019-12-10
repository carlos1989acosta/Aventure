<%-- 
    Document   : index
    Created on : 10-dic-2019, 11.37.57
    Author     : ACOSTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
         <body>
            <h:form>
                <h3>Por favor, introdusca la siguiente informacion </h3>
                <table> 
                    <tr> 
                        <td>Nombre:</td>
                        <td>
                            <h:inputText value="#{ManagedBean.usuarios.name}"/>
                        </td>
                    </tr>
                        <tr> 
                        <td>user:</td>
                        <td>
                            <h:inputText value="#{ManagedBean.usuarios.user}"/>
                        </td>
                  </tr>
                      <tr> 
                        <td>passwor:</td>
                        <td>
                            <h:inputText value="#{ManagedBean.usuarios.password}"/>
                        </td>
                  </tr>
                                 
                                                   
                </table>
                        <p>
                            <h:commandButton value="Registrar"  action="#{ManagedBean.adicionarusuarios()}"/>
                        </p>
                          <p>
                            <h:commandButton value="Ingresar"  action="Login"/>
                        </p>
            </h:form>            
        </body>
    </html>
</f:view>
