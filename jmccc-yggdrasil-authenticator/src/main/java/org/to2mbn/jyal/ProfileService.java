package org.to2mbn.jyal;

import java.util.UUID;
import org.to2mbn.jmccc.auth.AuthenticationException;

public interface ProfileService {

	PropertiesGameProfile getGameProfile(UUID profileUUID) throws AuthenticationException;

	PlayerTextures getTextures(PropertiesGameProfile profile) throws AuthenticationException;

}
