package org.example.test_patterns;

import org.example.memento_pattern.OperatingSystem;
import org.example.memento_pattern.OperatingSystemCaretaker;

public class TestMementoPattern {

    public static void testMementoPattern() throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
