package org.example.memento_pattern;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;

    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Created backup nr: " + this.backupNumber + " with data: " + backupDate);
    }

    public OperatingSystemMemento save() {
        System.out.println("Creating OperatingSystemMemento");
        return new OperatingSystemMemento(this.backupNumber,this.backupDate);
    }

    public void load(OperatingSystemMemento memento) {
        this.backupNumber = memento.getBackupNumber();
        this.backupDate = memento.getBackupDate();
        System.out.printf("Loaded OperatingSystemMemento; backup nr: %d with date %s\n",
                memento.getBackupNumber(),memento.getBackupDate().toString());
    }

}
