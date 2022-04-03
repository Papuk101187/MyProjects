
<#macro login path>

    <form action="${path}" method="post">
        <div><label> Login : <input type="text" name="login" required /> </label></div>
        <div><label> Password : <input type="password" name="password" required /> </label></div>
        <div><label><button name="type" value="customer"> Я продавец </button> </label></div>
        <div><label><button name="type" value="seller">Я покупатель </button> </label></div>
    </form>





</#macro>

