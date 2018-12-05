package org.mac.docapi.v2.entity.deployment;

import org.mac.docapi.v2.entity.content.WithAbstract;
import org.mac.docapi.v2.entity.responsibility.HasRole;
import org.mac.docapi.v2.entity.responsibility.ManagementRole;

interface DeploymentProcedure extends HasRole<ManagementRole>, WithAbstract {
	DeployableFeature getDeployableFeature();
	DeploymentPhase getDeploymentPhase();
}