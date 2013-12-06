/*
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
*/

package com.btcven.shortcut;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent; 
import android.net.Uri;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bitcoinvenezuela.com/"));
		startActivity(browserIntent);
		finish();
        System.exit(0);
    }
	private static final String BASE64_PUBLIC_KEY = "";
}
