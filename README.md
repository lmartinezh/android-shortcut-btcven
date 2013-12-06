BTCVEN Web Shortcut for Android
==========================================

Bookmark of the Web Site http://www.bitcoinvenezuela.com/


License
=======

	BTCVEN Web Shortcut is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	BTCVEN Web Shortcut is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with BTCVEN Web Shortcut. If not, see <http://www.gnu.org/licenses/>.

	Original Author: Alexander Salas <alexandersalas@bitcoinvenezuela.com>

	Developers: Alexander Salas <alexandersalas@bitcoinvenezuela.com>
	Contributors: Alexander Salas <alexandersalas@bitcoinvenezuela.com>
	Translators: Fatma Youssef <fatma.youssef@globaltranslator.info>


Building
========

**On Windows**
Get the Android SDK http://developer.android.com/sdk/index.html <br/>
Get the Apache Ant™ http://ant.apache.org/bindownload.cgi <br/>
Get the GitHub http://windows.github.com/

For debug:

```bash
mkdir %ProgramFiles32%\apache\ant
set PATH=PATH;%ProgramFiles(x86)%\android\tools\;%ProgramFiles(x86)%\android\plataform-tools\;%ProgramFiles32%\apache\ant
set JAVA_HOME=%ProgramFiles(x86)%\java\jdk#.#.#_##
cd  %HOMEPATH%\Documents\GitHub\btcven-shortcut-android
ant debug
adb install -r bin\btcven-debug.apk
```
For release:

```bash
mkdir %ProgramFiles32%\apache\ant
set PATH=PATH;%ProgramFiles(x86)%\android\tools\;%ProgramFiles(x86)%\android\plataform-tools\;%ProgramFiles32%\apache\ant
set JAVA_HOME=%ProgramFiles(x86)%\java\jdk#.#.#_##
cd  %HOMEPATH%\Documents\GitHub\btcven-shortcut-android
ant release
[input] Please enter keystore password (store:C:keystorebtcven.keystore): xxxxxxxxxxxxxxxx
[input] Please enter password for alias 'btcven': xxxxxxxxxxxxxxxx

adb install -r bin\btcven-release.apk
```
For make a keystore:

```bash
"%JAVA_HOME%/bin/keytool"  -genkeypair -v -keystore C:\keystore\btcven.keystore -alias btcven -keyalg RSA -keysize 2048 -validity 10000 -keypass xxxxxxxxxxxxxxxx -storepass xxxxxxxxxxxxxxxx
Generando par de claves RSA de 2.048 bits para certificado autofirmado (SHA256withRSA) con una validez de 10.000 días para: CN=Alexander Salas, OU=btcven, O=Bitcoin Venezuela, L=Valencia, ST=Carabobo, C=VE

```