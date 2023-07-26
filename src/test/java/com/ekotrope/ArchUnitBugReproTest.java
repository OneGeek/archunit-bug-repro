package com.ekotrope;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.Test;

public class ArchUnitBugReproTest {
    @Test
    public void broken() {
        new ClassFileImporter().importClass(com.ekotrope.broken.Outer.class);
    }
    
    @Test
    public void working() {
        new ClassFileImporter().importClass(com.ekotrope.working.Outer.class);
    }
}
