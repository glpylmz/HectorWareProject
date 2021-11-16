package com.HectorWare.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                 "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/HectorWare/step_definitions",
        dryRun = true,
        tags = "@wip"
)
public class Runner {

}




//==>        // dryRun = true   ===>   // dryRun we are checking loginstep Definetion if any step has implementation
// yani diger methodlari (testleri) calistirmadan sadece defined mi degil mi kontrolunu yapiyor olmayani veriyor ki kopyala yapistir ile methodu olusturalim
// ==>    tags = "@run"
// tagleri login feture daki kontrol edicek bu tag e sahip olanlari calistiracak birden cogu bu tage sahipse hepsini valistiracak
//==>        tags = "@driver and @VYT-123"  eskiden {"@driver","@VYT-123"} bu sekilde yazilyordu
//        both condition is correct
//==>         tags = "@driver or @store_manager"
//        either this or that
//        tags = "@run and not @wip and not @driver"
// @run i calistir ama wip i ve @driver i calistirma


