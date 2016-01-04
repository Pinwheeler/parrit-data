package com.data.parrit;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "workspaces", path = "workspaces")
public interface WorkspaceRepository extends PagingAndSortingRepository<Workspace, Long> {

}
