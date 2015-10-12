package org.virtue.game.logic.node.entity.player.identity;

import org.virtue.utility.Encryption;

/**
 * @author Taylor
 * @date Jan 15, 2014
 */
public class Password {

	/**
	 * Represents the password.
	 */
	private String password;
	
	/**
	 * Represents if the password is encrypted.
	 */
	private boolean encrypt;

	/**
	 * @return the encrypt
	 */
	public boolean isEncrypt() {
		return encrypt;
	}

	/**
	 * Constructs a new {@code Password.java}.
	 * @param password The password.
	 * @param encrypt Encrypt.
	 */
	public Password(String password, boolean encrypt) {
		this.password = (encrypt ? Encryption.SHA1Encryption(password).getEncryption() : password);
		this.encrypt = encrypt;
	}
	
	/**
	 * @param encrypt the encrypt to set
	 */
	public void setEncrypt(boolean encrypt) {
		this.encrypt = encrypt;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	public void applyEncryption () {
		this.password = Encryption.SHA1Encryption(password).getEncryption();
		this.encrypt = true;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = (encrypt ? Encryption.SHA1Encryption(password).getEncryption() : password);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Password) {
			Password otherPassword = (Password) other;
			if (otherPassword.isEncrypt()) {
				return otherPassword.getPassword().equals(Encryption.SHA1Encryption(password).getEncryption());
			} else if (encrypt) {
				return Encryption.SHA1Encryption(otherPassword.getPassword()).getEncryption().equals(password);
			}
		}
		return false;
	}
}
