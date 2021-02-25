package net.gotev.uploadservice.exceptions

import net.gotev.uploadservice.UploadThrowable
import java.lang.Exception

class UserCancelledUploadException(httpMethod: String, exception: Exception? = null) : UploadThrowable(message = "User cancelled upload", httpMethod = httpMethod, exception)
class UploadError(httpMethod: String, exception: Exception? = null) : UploadThrowable(message = if (exception == null) "Server error" else exception.toString(), httpMethod = httpMethod, exception = exception)
