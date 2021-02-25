package net.gotev.uploadservice.exceptions

import net.gotev.uploadservice.UploadThrowable
import java.lang.Exception
import net.gotev.uploadservice.network.ServerResponse

class UserCancelledUploadException(httpMethod: String, exception: Exception? = null) : UploadThrowable(message = "User cancelled upload", httpMethod = httpMethod, exception)
class UploadError(val serverResponse: ServerResponse, httpMethod: String, exception: Exception? = null) : UploadThrowable(message = "Upload error", httpMethod = httpMethod, exception = exception)
