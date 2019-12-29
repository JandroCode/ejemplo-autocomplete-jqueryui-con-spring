# ejemplo-autocomplete-jqueryui-con-spring

Ejemplo sencillo de como crear un autocompletado de productos en un proyecto spring usando jquery-ui

Lo más importante es comprender como funcionan los métodos source y select. Source sirve para conectar con la base de datos
y hace el matching del término introducido en un campo de texto con el campo de la base de datos. Select hace algo con ese
producto ( en este caso) seleccionado que, según este código, seleccionará el producto para introducirlo en el mismo
campo de texto donde se realiza la búsqueda.
