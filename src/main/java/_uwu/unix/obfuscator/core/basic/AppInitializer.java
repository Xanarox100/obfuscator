package _uwu.unix.obfuscator.core.basic;

import _uwu.unix.obfuscator.api.basic.Obfuscator;

/**
 * @author Unix on 31.08.2019.
 */
public class AppInitializer {

    public static void main(String... args) {
        final Obfuscator obfuscator = new ObfuscatorImpl();
        final Thread thread = new Thread(obfuscator::onLoad);

        thread.setName("Obfuscator");
        thread.start();
    }
}