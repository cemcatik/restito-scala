package com.xebialabs.restito.scala

import org.glassfish.grizzly.http.util.{HttpStatus => XHttpStatus}
import XHttpStatus._

object HttpStatus {
  val Continue                    = CONINTUE_100
  val SwitchingProtocols          = SWITCHING_PROTOCOLS_101
  val WebSocketProtocolHandshake  = WEB_SOCKET_PROTOCOL_HANDSHAKE_101
  val Ok                          = OK_200
  val Created                     = CREATED_201
  val Accepted                    = ACCEPTED_202
  val NonAuthorativeInformation   = NON_AUTHORATIVE_INFORMATION_203
  val NoContent                   = NO_CONTENT_204
  val ResetContent                = RESET_CONTENT_205
  val PartialContent              = PARTIAL_CONTENT_206
  val MultipleChoices             = MULTIPLE_CHOICES_300
  val MovedPermanently            = MOVED_PERMANENTLY_301
  val Found                       = FOUND_302
  val SeeOther                    = SEE_OTHER_303
  val NotModified                 = NOT_MODIFIED_304
  val UseProxy                    = USE_PROXY_305
  val TemporaryRedirect           = TEMPORARY_REDIRECT_307
  val PermanentRedirect           = PERMANENT_REDIRECT_308
  val BadRequest                  = BAD_REQUEST_400
  val Unauthorized                = UNAUTHORIZED_401
  val PaymentRequired             = PAYMENT_REQUIRED_402
  val Forbidden                   = FORBIDDEN_403
  val NotFound                    = NOT_FOUND_404
  val MethodNotAllowed            = METHOD_NOT_ALLOWED_405
  val NotAcceptable               = NOT_ACCEPTABLE_406
  val ProxyAuthenticationRequired = PROXY_AUTHENTICATION_REQUIRED_407
  val RequestTimeout              = REQUEST_TIMEOUT_408
  val Conflict                    = CONFLICT_409
  val Gone                        = GONE_410
  val LengthRequired              = LENGTH_REQUIRED_411
  val PreconditionFailed          = PRECONDITION_FAILED_412
  val RequestEntityTooLarge       = REQUEST_ENTITY_TOO_LARGE_413
  val RequestUriTooLong           = REQUEST_URI_TOO_LONG_414
  val UnsupportedMediaType        = UNSUPPORTED_MEDIA_TYPE_415
  val RequestRangeNotSatisfiable  = REQUEST_RANGE_NOT_SATISFIABLE_416
  val ExpectationFailed           = EXPECTATION_FAILED_417
  val InternalServerError         = INTERNAL_SERVER_ERROR_500
  val NotImplemented              = NOT_IMPLEMENTED_501
  val BadGateway                  = BAD_GATEWAY_502
  val ServiceUnavailable          = SERVICE_UNAVAILABLE_503
  val GatewayTimeout              = GATEWAY_TIMEOUT_504
  val HttpVersionNotSupported     = HTTP_VERSION_NOT_SUPPORTED_505
}
