<em>CONVERSOR DE MONEDA</em>

<p>
app desarrollada como parte del curso de Alura Backend con Java G6 en esta se realiza la 
consulta a la api <a>https://app.exchangerate-api.com</a> la cual mediante unas 
credenciales nos provee la siguiente información en formato Json
</p>
<p>
<code>
{
	"result": "success",
	"documentation": "https://www.exchangerate-api.com/docs",
	"terms_of_use": "https://www.exchangerate-api.com/terms",
	"time_last_update_unix": 1585267200,
	"time_last_update_utc": "Fri, 27 Mar 2020 00:00:00 +0000",
	"time_next_update_unix": 1585270800,
	"time_next_update_utc": "Sat, 28 Mar 2020 01:00:00 +0000",
	"base_code": "EUR",
	"target_code": "GBP",
	"conversion_rate": 0.8412
}
</code>
</p>
<p>
mediante el uso del Paquete Gson, transformamos esta informacion a un objeto y realizamos los 
calculos correspondientes para hacer la conversion 
</p>

<p>para este desarrollo se utiliza <strong>Maven</strong> como gestor de paquetes y <strong>Java 17</strong></p>