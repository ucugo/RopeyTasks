recaptcha {
    // These keys are generated by the ReCaptcha service
	publicKey = "6LeRp9ASAAAAANe2Scl5NHKDrJxhVz1cNR6xRcT2"
	privateKey = "6LeRp9ASAAAAAKvLvhAYgfHasL91VURhDip0CI3y"

	// Include the noscript tags in the generated captcha
	includeNoScript = true
}

mailhide {
    // Generated by the Mailhide service
    publicKey = ""
    privateKey = ""
}

environments {
  development {
    recaptcha {
      // Set to false to disable the display of captcha
      enabled = false

      // Communicate using HTTPS
      useSecureAPI = false
    }
  }
  production {
    recaptcha {
      // Set to false to disable the display of captcha
      enabled = false

      // Communicate using HTTPS
      useSecureAPI = false
    }
  }
}