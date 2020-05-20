FUTBO MANIAKOS
-----------------------------------------------------------






**FICHA TECNICA DE USO**

**Nombre**: Enviar alerta a usuarios

_______________________________________________________________

­**Autor:** Pablo José Cerero

_______________________________________________________________

**Fecha:** 20/05/2020

_______________________________________________________________

**Descripción:** Permite crear alertas de aportes para la mejorar de la web. Donde habrá dos funciones: una sera una alerta de advertencia y la otra alerta de baneo que viene incluida con el baneo del usuario por X tiempo. La escritura se hará desde un cuadrado pequeño (No tan grande como para enviar mensajes en el foro) y con un solo modo de estilo de escritura.

_______________________________________________________________

**Actores:** Moderador/Usuario

_______________________________________________________________

**Precondiciones:** 
Que el moderador tenga los permisos necesarios para enviar las alertas a los usuarios solicitados

Que el usuario no este baneado tiemp atras
_____________________________________________________________________________

**Flujo Normal:** [1] El actor (Moderador) entrar en la sección de moderación, exclusivo solo para los moderadores

[2] El moderador clica en la sub-sección de enviar alertas

[3] El moderador escribe la alerta que crea necesario según el nivel de la gravedad del asunto y decidirá si esa aleta sera de forma amistosa o con baneo incluido

[4] El moderador clica al botón de enviar para que le llegue la alerta al usuario

[5] El usuario recibe la alerta del moderador

[6] El usuario puede acabar baneado si la alerta venia incluida con baneo.


_____________________________________________________________________________

**Flujo Alternativo:** [5.A] El usuario no le llegar nunca la alerta porque dicho usuario ya estaba baneado de antes, asi que se le reenviara un mensaje al moderador que ese usuario ya esta baneado por X moderador y a X tiempo

[6.A] El usuario no ha sido baneado porque ese usuario es el administrador de la web, se le enviara un mensaje al moderador de que dicho usuario es totalmente imposible de que sea baneado por X razones 

______________________________________________________________________________

**Poscondiciones:** La alerta ha sido almacenado en la base de datos de mensajes y recibido  por el usuario de la web.
