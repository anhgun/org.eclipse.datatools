## Copyright (c) 2005, 2011 Sybase, Inc. and others.
## All rights reserved. This program and the accompanying materials
## are made available under the terms of the Eclipse Public License v1.0
## which accompanies this distribution, and is available at
## http://www.eclipse.org/legal/epl-v10.html
##
## Contributors:
##    Sybase, Inc. - initial API and implementation
##    IBM Corporation - migrated to new wizard framework
##    IBM Corporation - fix for defect 222818
##    Actuate Corporation - added the cipherProvider extension point [BZ 358686]
################################################################################ 
plugin.internal_error=Error interno\: org.eclipse.datatools.connectivity
ConnectionProfileConstants.unknownVersion=desconocida
dialog.title.error.loadconnectionfactory = Error al cargar la f�brica de conexi�n en "{0}"!
ConnectJob.name=Creando conexiones a {0}.
ConnectJob.status.info=No se han podido crear conexiones a {0} para una o varias extensiones.
ConnectJob.status.error=No se ha podido conectar a {0}.
DisconnectJob.name=Cerrando conexiones a {0}.
DisconnectJob.status.info=No se han podido cerrar conexiones a {0} para una o varias extensiones.
DisconnectJob.status.error=No se ha podido desconectar de {0}.
CreateConnectionJob.name=Creando {0} a {1}.
CreateConnectionJob.error=Error al crear la conexi�n {0} a {1}. (Error\: {2})
OpenConnectionEventJob.name=Procesando evento de apertura de conexi�n para {0}.
CloseManagedConnectionJob.name=Cerrando la conexi�n {0} de {1}.
CloseManagedConnectionJob.error=Ha ocurrido un error al cerrar la conexi�n {0} de {1} (Error\: {2}).
CloseConnectionEventJob.name=Procesando evento de cierre de conexi�n para {0}.
assert.invalid.profile = Error al analizar\: atributo no v�lido ({0})
assert.invalid.profile.duplicateFactory = Error al analizar\: id de f�brica duplicado y prioridad duplicada ({0})
assert.invalid.profile.nullFactory = Error al analizar\: f�brica o id de f�brica nulos ({0}/{1})
dialog.title.error.loadwizard = Error al cargar el nuevo asistente en "{0}"!
operation.new.connectionprofile = Perfil de creaci�n\: "{0}"
error.connect = Problema al conectar con el perfil "{0}." Para obtener m�s informaci�n, vea el archivo de registro.
marker.error = Problema al conectar con el perfil {0}. (Error\: {1})
drivermarker.error = Existe un problema con el controlador "{0}." (Error\: {1})
drivermarker.import.error = Falta la lista jar para la definici�n de controlador creada durante la importaci�n de perfil "{0}."
profile.duplicate =Nombre de perfil de conexi�n duplicado "{0}"\!
profile.notexist = El perfil de conexi�n "{0}" no existe.
duplicate.profile.name = Copia de {0}({1})
DriverConnectionBase.error.unknown=La conexi�n ha fallado con un error no especificado.
DriverConnectionBase.error.driverDefinitionNotSpecified=No se ha especificado la definici�n de controlador.
DriverConnectionBase.error.driverDefinitionNotFound=No se ha encontrado la definici�n de controlador.
error.loadprofilesxml = Error al cargar los datos del perfil de conexi�n.
error.saveprofilesxml = Error al guardar los datos del perfil de conexi�n.
error.loaddriversxml = Error al cargar los datos de definici�n de controlador.
error.savedriversxml = Error al guardar los datos de definici�n de controlador.

trace.error.propertiesPersistenceHook = No se ha podido cargar propertiesPersistenceHook, se usar� el valor predeterminado (tipo de perfil={0}, extensi�n={1})
trace.error.propertiesPersistenceHookSaveError = Error al llamar al enlace persistente de las propiedades; se mantienen todas las propiedades (perfil={0}, extensi�n={1})
trace.error.propertiesPersistenceHookLoadError = Error al llamar al enlace persistente de las propiedades; propiedades transitorias no establecidas (perfil={0}, extensi�n={1})
trace.error.migration = Error al cargar el elemento de migraci�n para el proveedor de perfil de conexi�n (id={0}, clase de migraci�n={1})
trace.error.drivermigration = Error al crear la instancia de perfil de controlador (id={0}, id de controlador={1})

migration.error.providerDoesNotExist = Error al cargar el elemento de migraci�n: el newProviderID especificado no es v�lido (newProviderID={0})
migration.error.invalidPropertyMigrationElement = Error al cargar el elemento de migraci�n: propertyMigration debe especificar una newPropertyKey, una oldPropertyKey o ambas
migration.error.unknownParentElement = Error al cargar el elemento de migraci�n: elemento principal desconocido (nombre del elemento principal={0})

DriverUtil.taskName = Procesando clases en {0}

Category.Name.Unknown=No admitido

WorkOfflineJob.name = Cambio de {0} para trabajar en modo desconectado.
WorkOfflineJob.status.error = No se han podido crear conexiones offline con {1} para una o m�s extensiones.

SaveWorkOfflineDataJob.name = Guardar datos sin conexi�n para {0}.
SaveWorkOfflineDataJob.status = Guardar el estado de los datos sin conexi�n.

CreateOfflineConnectionJob.name = Creando conexiones {0} offline con {1}.
CreateOfflineConnectionJob.error = Error al crear conexiones {0} offline con {1}. (Error\: {2})

ManagedConnection_save_not_connected_error = Debe estar conectado al servidor para guardar los datos sin conexi�n.
ManagedConnection_offline_not_supported_error = {0} no es compatible con el trabajo sin conexi�n.

drivers.error.finding.property.no.template = Se ha producido un problema al intentar recuperar {0} de la plantilla de controlador.

JDBCConnection.technologyName = JDBC
JDBCConnection.invalidDriverDefinition = {0}\: {1}. Utilizar las propiedades de controlador definidas en el perfil de bases de datos en su lugar.

error.database.not.start = No se ha introducido ning�n comando de inicio de base de datos. ErrorCode = {0}, SQLState = {1}.
PluginResourceLocator.invalidURL = URL no v�lida {0} (Error\: {1})
ConnectivityPlugin.error.noDefaultWorkspace = No es posible determinar la ubicaci�n predeterminada del �rea de trabajo.  Compruebe la configuraci�n de la plataforma sin OSGi de la ruta del �rea de trabajo de las herramientas de datos o el complemento.
CipherProviderExtensions.missingRequiredAttrValue = El elemento {0} de la extensi�n {1} proporcionada por {2} carece de un valor en uno o varios de los atributos necesarios: {3}={4}, {5}={6}
CipherProviderExtensions.invalidClassAttrValue = Tipo de clase no v�lido ({0}) en la extensi�n {1} proporcionada por {2}.  Debe implementar la interfaz {3} de Java.
CipherProviderExtensions.conflictingExtensions = El ICipherProvider ({0}) registrado ha sido sustituido por el ICipherProvider ({1}) proporcionado por otra extensi�n en {2} para la misma extensi�n de archivo ({3}).

