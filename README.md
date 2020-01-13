### Clonar repositorio
git clone https://github.com/CarlosCastillo10/DBRepository.git

#### Actualizar las ramas
Si acabas de clonar el repositorio, no necesitas hacer esto, pero si no, simplemente tienes que hacer lo siguiente **para cada rama**:

`git status` En el log de este comando te dará el nombre de la rama, por ejemplo : `master`

Una vez que sabes el nombre de la rama, puedes traerte los cambios de la rama en github con el comandod:
`git pull origin [nombre de la rama]`

#### Cambiarse de ramas
Para ello usas el comando
`git checkout [nombre de la rama]`
Recuerda que debes tener tu arbol de trabajo limpio ara poder hacerlo.

### ¿Cómo subir tus cambios?
Si quieres hacer cambios, lo primero que dedbes hacer es crear una nueva rama a partir de la rama `development`. 

`git checkout development`

`git pull origin development`

`git branch [nombre de la nueva rama]`

`git checkout [nombre de la nueva rama]`

Ahora si puedes empezar a hacer modificaciones. Puedes ir haciendo commits por cada cambio que hagas para tener un mejor historial de tu código.

Una vez que hayas terminado de hacer tus contribuciones en tu rama, es momento de hacer que todos los demás integrantes la tengan, para ello debes:

1. Subir tus cambios a la rama remota:
`git push origin [nombre de tu rama]`

2. Crear un pull request desde la rama `development` hacia tu rama.
	Abres un nuevo pull request
	En `base` escoges tu rama
	En `compare` escoges development
	Creas el pull request
Nota: Como es un pull request hacia un rama tuya, puedes acpetar el pull request tu mismo enseguida.

3. Crear un pull request desde tu rama hacia `development`:
	Abres un nuevo pull request
	En `base` escoges development
	En `compare` escoges tu rama
	Creas el pull request
Nota: Aquí lo ideal es que alguien más aceptase tu pull request

Y listo. 

## Referencias
Guía de Git y GitHub: https://medium.com/@sthefany/primeros-pasos-con-github-7d5e0769158c
