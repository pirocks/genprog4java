#!/bin/bash

#Sample of how to run it: ./runSeveralSeeds.sh /home/mau/Research/genprog4java/ /home/mau/

GENPROGPATH="$1"
MAVENM2PATH="$2"

for (( seed=0; seed<=9; seed++ ))
do	
	echo "RUNNING THE BUG WITH THE SEED: $seed"
	
	CHANGESEEDCOMMAND="sed -i '4s/.*/seed = $seed/' "templatePlaygroundTest.config

	eval $CHANGESEEDCOMMAND
    
/usr/lib/jvm/java-7-oracle/bin/java -ea -Dlog4j.configurationFile=file:$GENPROGPATH/src/log4j.properties -Dfile.encoding=UTF-8 -classpath $GENPROGPATH/target/classes:/usr/share/eclipse/dropins/jdt/plugins/org.junit_4.8.2.dist/junit.jar:/usr/share/eclipse/dropins/jdt/plugins/org.hamcrest.core_1.3.0.jar:$GENPROGPATH/lib/junit-4.12.jar:$MAVENM2PATH.m2/repository/org/eclipse/tycho/org.eclipse.jdt.core/3.11.1.v20150902-1521/org.eclipse.jdt.core-3.11.1.v20150902-1521.jar:$MAVENM2PATH.m2/repository/org/eclipse/core/runtime/3.10.0-v20140318-2214/runtime-3.10.0-v20140318-2214.jar:$MAVENM2PATH.m2/repository/org/eclipse/osgi/3.10.0-v20140606-1445/osgi-3.10.0-v20140606-1445.jar:$MAVENM2PATH.m2/repository/org/eclipse/equinox/common/3.6.200-v20130402-1505/common-3.6.200-v20130402-1505.jar:$MAVENM2PATH.m2/repository/org/eclipse/core/jobs/3.6.0-v20140424-0053/jobs-3.6.0-v20140424-0053.jar:$MAVENM2PATH.m2/repository/org/eclipse/equinox/registry/3.5.400-v20140428-1507/registry-3.5.400-v20140428-1507.jar:$MAVENM2PATH.m2/repository/org/eclipse/equinox/preferences/3.5.200-v20140224-1527/preferences-3.5.200-v20140224-1527.jar:$MAVENM2PATH.m2/repository/org/eclipse/core/contenttype/3.4.200-v20140207-1251/contenttype-3.4.200-v20140207-1251.jar:$MAVENM2PATH.m2/repository/org/eclipse/equinox/app/1.3.200-v20130910-1609/app-1.3.200-v20130910-1609.jar:$MAVENM2PATH.m2/repository/org/eclipse/text/org.eclipse.text/3.5.101/org.eclipse.text-3.5.101.jar:$MAVENM2PATH.m2/repository/org/eclipse/core/org.eclipse.core.commands/3.6.0/org.eclipse.core.commands-3.6.0.jar:$MAVENM2PATH.m2/repository/org/eclipse/equinox/org.eclipse.equinox.common/3.6.0/org.eclipse.equinox.common-3.6.0.jar:$MAVENM2PATH/.m2/repository/org/jacoco/org.jacoco.core/0.7.6.201602180812/org.jacoco.core-0.7.6.201602180812.jar:$MAVENM2PATH/.m2/repository/org/ow2/asm/asm-debug-all/5.0.4/asm-debug-all-5.0.4.jar:$MAVENM2PATH/.m2/repository/commons-io/commons-io/1.3.2/commons-io-1.3.2.jar:$MAVENM2PATH/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$MAVENM2PATH/.m2/repository/commons-cli/commons-cli/20040117.000000/commons-cli-20040117.000000.jar:$MAVENM2PATH/.m2/repository/org/eclipse/core/resources/3.3.0-v20070604/resources-3.3.0-v20070604.jar:$MAVENM2PATH/.m2/repository/org/eclipse/core/expressions/3.3.0-v20070606-0010/expressions-3.3.0-v20070606-0010.jar:$MAVENM2PATH/.m2/repository/org/eclipse/core/filesystem/1.1.0-v20070606/filesystem-1.1.0-v20070606.jar:$MAVENM2PATH/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:$MAVENM2PATH/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:$MAVENM2PATH/.m2/repository/org/junit/junit4-runner/5.0.0-ALPHA/junit4-runner-5.0.0-ALPHA.jar:$MAVENM2PATH/.m2/repository/junit/junit/4.12/junit-4.12.jar:$MAVENM2PATH/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$MAVENM2PATH/.m2/repository/org/junit/junit-launcher/5.0.0-ALPHA/junit-launcher-5.0.0-ALPHA.jar:$MAVENM2PATH/.m2/repository/org/junit/junit-engine-api/5.0.0-ALPHA/junit-engine-api-5.0.0-ALPHA.jar:$MAVENM2PATH/.m2/repository/org/junit/junit-commons/5.0.0-ALPHA/junit-commons-5.0.0-ALPHA.jar:$MAVENM2PATH/.m2/repository/org/opentest4j/opentest4j/1.0.0-ALPHA/opentest4j-1.0.0-ALPHA.jar clegoues.genprog4java.main.Main $GENPROGPATH/tests/ExamplePvsRModels1/templatePlaygroundTest.config

done

