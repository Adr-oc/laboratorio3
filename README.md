# Laboratorio 3 - Herencia
23739
Adrian Orantes


## UML
![src](https://github.com/Adr-oc/laboratorio3/assets/132016076/e386ef35-9e4a-4946-b008-3ff61087d388)




# Analisis

**Requisitos funcionales**

- El sistema debe permitir la creación, modificación y eliminación de prendas de vestir.
- El sistema debe permitir el seguimiento de las ventas de prendas de vestir.
- El sistema debe permitir la clasificación de prendas de vestir por categoría.

**Descripción de clases**

- **`Prenda (padre)`:** Clase abstracta que representa una prenda de vestir.
- **`Pantalon (hija)`:** Clase que representa un pantalón.
- **`Camisa (hija)`:** Clase que representa una camisa.
- **`Collar (hija)`:** Clase que representa un collar.
- **`Inventario`:** Clase que representa el inventario de prendas de vestir.
- **`CSVReader`:** Clase que lee un archivo CSV con datos de prendas de vestir.
- **`Vista`:** Clase que representa la interfaz de usuario del sistema.

**Descripción de atributos**

- **`Prenda`:**
    - **`id`:** Identificador único de la prenda.
    - **`nombre`:** Nombre de la prenda.
    - **`estado`:** Estado de la prenda (nuevo, usado, dañado).
    - **`precio`:** Precio de la prenda.
    - **`cantidadDisponible`:** Cantidad disponible de la prenda.
    - **`cantidadVendida`:** Cantidad vendida de la prenda.
    
- **`Pantalon`:**
    - **`talla`:** Talla del pantalón.
    - **`color`:** Color del pantalón.
    
- **`Camisa`:**
    - **`tipo`:** Tipo de camisa (manga corta, manga larga).
    - **`material`:** Material de la camisa.
    
- **`Collar`:**
    - **`material`:** Material del collar.
    - **`tipo`:** Tipo de collar (collar, gargantilla).
    
- **`Inventario`:**
    - **`prendas`:** Lista de prendas de vestir en el inventario.
    
- **`CSVReader`:**
    - **`archivoCSV`:** Ruta al archivo CSV con datos de prendas de vestir.
    

**Descripción de métodos**

- **Prenda:**
    - **crearPrenda(String nombre, int id, String estado, double precio, int cantidadDisponible):** Crea una nueva prenda de vestir.
    - **modificarPrenda(Prenda prenda):** Modifica los datos de una prenda de vestir.
    - **eliminarPrenda(Prenda prenda):** Elimina una prenda de vestir.
- **Pantalon:**
    - **getTalla():** Obtiene la talla del pantalón.
    - **setTalla(int talla):** Establece la talla del pantalón.
    - **getColor():** Obtiene el color del pantalón.
    - **setColor(String color):** Establece el color del pantalón.
- **Camisa:**
    - **getTipo():** Obtiene el tipo de camisa.
    - **setTipo(String tipo):** Establece el tipo de camisa.
    - **getMaterial():** Obtiene el material de la camisa.
    - **setMaterial(String material):** Establece el material de la camisa.
- **Collar:**
    - **getMaterial():** Obtiene el material del collar.
    - **setMaterial(String material):** Establece el material del collar.
    - **getTipo():** Obtiene el tipo de collar.
    - **setTipo(String tipo):** Establece el tipo de collar.
- **Inventario:**
    - **addPrenda(Prenda prenda):** Agrega una prenda de vestir al inventario.
    - **getVentasCategoria(String categoria):** Obtiene las ventas de prendas de vestir de una categoría.
    - **getProdCategoria(String categoria):** Obtiene las prendas de vestir de una categoría.
    - **getListToPrenda(Inventario inventario):** Obtiene una lista de prendas de vestir.
    - **getCantidadDisponibles():** Obtiene la cantidad disponible de prendas de vestir.
- **CSVReader:**
    - **leerArchivoCSV():** Lee el archivo CSV con datos de prendas de vestir.
