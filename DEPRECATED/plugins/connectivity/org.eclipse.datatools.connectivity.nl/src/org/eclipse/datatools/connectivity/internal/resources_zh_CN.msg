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
plugin.internal_error=内部错误 － org.eclipse.datatools.connectivity
ConnectionProfileConstants.unknownVersion=未知
dialog.title.error.loadconnectionfactory = 在“{0}”中加载连接工厂时出错!
ConnectJob.name=正在创建与 {0} 的连接。
ConnectJob.status.info=未能为一个或多个扩展创建与 {0} 的连接。
ConnectJob.status.error=未能连接到 {0}。
DisconnectJob.name=正在关闭与 {0} 的连接。
DisconnectJob.status.info=未能为一个或多个扩展关闭与 {0} 的连接。
DisconnectJob.status.error=未能与 {0} 断开连接。
CreateConnectionJob.name=创建 {0} 至 {1}。
CreateConnectionJob.error=创建与 {1} 的 {0} 连接时出错。（错误：{2}）
OpenConnectionEventJob.name=正在处理 {0} 的打开连接事件。
CloseManagedConnectionJob.name=正在关闭到 {1} 的 {0} 连接。
CloseManagedConnectionJob.error=关闭到 {1} 的 {0} 连接时出错。(错误\: {2})
CloseConnectionEventJob.name=正在处理 {0} 的关闭连接事件。
assert.invalid.profile = 分析错误: 无效属性({0})
assert.invalid.profile.duplicateFactory = 分析错误\: 具有重复优先级({0})的重复工厂 ID
assert.invalid.profile.nullFactory = 分析错误\: 工厂或工厂 id 为空 ({0}/{1})
dialog.title.error.loadwizard = 在“{0}”中加载新向导时出错!
operation.new.connectionprofile = 正在创建配置文件:“{0}”
error.connect = 连接到配置文件“{0}”时出现问题。请查看日志文件以了解详情。
marker.error = 连接到配置文件 {0} 时出现问题。(错误: {1})
drivermarker.error = 驱动程序“{0}”出现问题。(错误\: {1})
drivermarker.import.error = 导入配置文件“{0}”过程中创建的驱动程序定义缺少 Jar 列表。
profile.duplicate =连接概要文件名“{0}”重复！
profile.notexist = 连接配置文件“{0}”不存在!
duplicate.profile.name = 复制 {0}({1})
DriverConnectionBase.error.unknown=发生了未指定的错误，连接失败。
DriverConnectionBase.error.driverDefinitionNotSpecified=未指定驱动程序定义。
DriverConnectionBase.error.driverDefinitionNotFound=找不到驱动程序定义。
error.loadprofilesxml = 加载连接配置文件数据时出错。
error.saveprofilesxml = 保存连接配置文件数据时出错。
error.loaddriversxml = 加载驱动程序定义数据时出错。
error.savedriversxml = 保存驱动程序定义数据时出错。

trace.error.propertiesPersistenceHook = 无法加载 propertiesPersistenceHook，使用默认值(配置文件类型为 {0}，扩展为 {1})
trace.error.propertiesPersistenceHookSaveError = 调用属性永久异常分支时出错；保持所有属性(配置文件为 {0}，扩展为 {1})
trace.error.propertiesPersistenceHookLoadError = 调用属性永久异常分支时出错；未设置永久属性(配置文件为 {0}，扩展为 {1})
trace.error.migration = 为连接配置文件提供程序加载迁移元素时出错(id={0}，迁移类={1})
trace.error.drivermigration = 创建配置文件(id={0}，驱动程序 id={1})的驱动程序实例时出错

migration.error.providerDoesNotExist = 加载迁移元素时出错: 指定的 newProviderID 无效(newProviderID={0})
migration.error.invalidPropertyMigrationElement = 加载迁移元素时出错: propertyMigration 必须指定 newPropertyKey、oldPropertyKey 或二者
migration.error.unknownParentElement = 加载迁移元素时出错: 未知父元素(父元素名称={0})

DriverUtil.taskName = 正在处理 {0} 中的类

Category.Name.Unknown=不支持

WorkOfflineJob.name = 将 {0} 更改为脱机工作模式。
WorkOfflineJob.status.error = 无法为一个或多个扩展创建到 {1} 的脱机连接。

SaveWorkOfflineDataJob.name = 保存 {0} 的脱机数据。
SaveWorkOfflineDataJob.status = 保存脱机数据状态。

CreateOfflineConnectionJob.name = 创建到 {1} 的脱机 {0} 连接。
CreateOfflineConnectionJob.error = 创建到 {1} 的脱机 {0} 连接时出错。(错误: {2})

ManagedConnection_save_not_connected_error = 必须连接到服务器才能保存脱机数据。
ManagedConnection_offline_not_supported_error = {0} 不支持脱机工作。

drivers.error.finding.property.no.template = 尝试从驱动程序模板中检索 {0} 时出现问题。

JDBCConnection.technologyName = JDBC
JDBCConnection.invalidDriverDefinition = {0}\: {1}. 使用数据库配置文件中定义的驱动程序属性。

error.database.not.start = 未发出启动数据库命令。 ErrorCode = {0}，SQLState = {1}。
PluginResourceLocator.invalidURL = 无效 URL {0} (错误\: {1})
ConnectivityPlugin.error.noDefaultWorkspace = 无法确定默认工作区位置。  检查插件的无 OSGi 平台配置或数据工具工作区路径。
CipherProviderExtensions.missingRequiredAttrValue = {2} 提供的 {1} 扩展中的 {0} 元素缺少一个或多个必需属性值: {3}={4}, {5}={6}
CipherProviderExtensions.invalidClassAttrValue = {2} 提供的 {1} 扩展中的类类型 {0} 无效。  它必须实现 {3} Java 接口。
CipherProviderExtensions.conflictingExtensions = 注册的 ICipherProvider ({0})已替换为 {2} 中的另一个扩展为相同文件扩展名({3})提供的 ICipherProvider ({1})。


