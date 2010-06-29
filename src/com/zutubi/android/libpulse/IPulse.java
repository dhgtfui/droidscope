package com.zutubi.android.libpulse;

import java.io.Closeable;
import java.util.List;

/**
 * High-level interface for communicating with a Pulse server.
 */
public interface IPulse extends Closeable
{
    /**
     * Returns the status of all concrete projects on the server.
     * 
     * @return a list of statuses, one for each project
     */
    List<ProjectStatus> getAllProjectStatuses();
    
    /**
     * Returns the status of the logged-in user's dashboard projects on the
     * server.
     * 
     * @return a list of statuses, one for each project
     */
    List<ProjectStatus> getMyProjectStatuses();
    
    /**
     * Triggers a new build of the given project.  The user must have trigger
     * permission for this to work.
     * 
     * @param project name of the project to trigger
     */
    void triggerBuild(String project);
}