################################################################################
## Copyright (c) 2005, 2011 Sybase, Inc. and others.
## All rights reserved. This program and the accompanying materials
## are made available under the terms of the Eclipse Public License v1.0
## which accompanies this distribution, and is available at
## http://www.eclipse.org/legal/epl-v10.html
##
## Contributors:
##    Sybase, Inc. - initial API and implementation
##    IBM Corporation -  fix for defect #223855
##	  Actuate Corporation - added the cipherProvider extension point [BZ 358686]
################################################################################ 
Plugin.Name = Data Tools Platform Connectivity Plug-in
Plugin.ProviderName = Eclipse Data Tools Platform

extension-point.name.cipherProvider = 연결 프로필 저장소 암호 공급자
extension-point.name.connectionProfile=연결 프로파일 확장
extension-point.name.driverExtension=driverExtension
extension-point.name.ProfileManagerInitializationProvider =  ProfileManagerInitializationProvider
ConnectionProfileRepository.Category.Name = 연결 프로필 리포지토리
