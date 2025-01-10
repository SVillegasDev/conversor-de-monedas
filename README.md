# Conversor de Monedas con Java y API

## 🛠️ Tecnologías Usadas
- **Java 17**: Lenguaje de programación utilizado para desarrollar el proyecto.
- **HttpClient**: Biblioteca para realizar solicitudes HTTP.
- **Gson**: Biblioteca para trabajar con JSON.
- **API de ExchangeRate-API**: Servicio externo para obtener las tasas de cambio entre monedas.

## 📄 Descripción del Proyecto
Este proyecto es un conversor de monedas que utiliza Java y consume una API externa para obtener las tasas de cambio actualizadas entre diferentes monedas. Permite convertir montos entre monedas específicas mediante un menú interactivo en la consola.

### Funcionalidades
1. **Conversión predefinida**: Convierte montos entre pares de monedas específicas:
   - Dólar (USD) a Peso Chileno (CLP) y viceversa.
   - Dólar (USD) a Peso Argentino (ARS) y viceversa.
   - Dólar (USD) a Real Brasileño (BRL) y viceversa.

2. **Conversión personalizada**: Permite al usuario ingresar manualmente dos monedas diferentes (por ejemplo, EUR a CLP) y un monto para realizar la conversión.

3. **Manejo de errores**:
   - Detecta cuando las monedas ingresadas no son compatibles con la API.
   - Evita conversiones entre monedas iguales (por ejemplo, CLP a CLP).

4. **Menú interactivo**: Proporciona una navegación sencilla para elegir opciones o salir del programa.

5. **Requisitos**:
  - Java 17 instalado.
  - Conexión a internet para consultar las tasas de cambio.
