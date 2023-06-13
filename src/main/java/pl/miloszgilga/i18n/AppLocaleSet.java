/*
 * Copyright (c) 2023 by MILOSZ GILGA <http://miloszgilga.pl>
 *
 * File name: AppLocaleSet.java
 * Last modified: 17/05/2023, 17:47
 * Project name: air-hub-master-server
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     <http://www.apache.org/license/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the license.
 */

package pl.miloszgilga.i18n;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.jmpsl.core.i18n.ILocaleEnumSet;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@Getter
@RequiredArgsConstructor
public enum AppLocaleSet implements ILocaleEnumSet {

    // respones
    REGISTERED_RES                                      ("airhubmaster.message.RegisteredRes"),
    LOGOUT_RES                                          ("airhubmaster.message.LogoutRes"),
    ACTIVATED_ACCOUNT_RES                               ("airhubmaster.message.ActivateAccountRes"),
    RESET_PASSWORD_REQUEST_RES                          ("airhubmaster.message.ResetPasswordRequestRes"),
    RESET_PASSWORD_CHANGE_RES                           ("airhubmaster.message.ResetPasswordChangeRes"),
    NEW_NAME_SET_RES                                    ("airhubmaster.message.NewNameSetRes"),
    NEW_LOGIN_SET_RES                                   ("airhubmaster.message.NewLoginSetRes"),
    NEW_EMAIL_ADDRESS_SET_RES                           ("airhubmaster.message.NewEmailAddressSetRes"),
    NEW_PASSWORD_SET_RES                                ("airhubmaster.message.NewPasswordSetRes"),
    REMOVE_ACCOUNT_RES                                  ("airhubmaster.message.RemoveAccountRes"),
    UPDATE_USER_LEVEL_RES                               ("airhubmaster.message.UpdateUserLevelRes"),
    UPDATE_USER_EXP_RES                                 ("airhubmaster.message.UpdateUserExpRes"),
    UPDATE_USER_MONEY_RES                               ("airhubmaster.message.UpdateUserMoneyRes"),

    // email
    ACTIVATED_ACCOUNT_TITLE_MAIL                        ("airhubmaster.email.title.ActivatedAccount"),
    REGISTER_TITLE_MAIL                                 ("airhubmaster.email.title.Register"),
    REQUEST_CHANGE_PASSWORD_TITLE_MAIL                  ("airhubmaster.email.title.RequestChangePassword"),
    CHANGE_PASSWORD_TITLE_MAIL                          ("airhubmaster.email.title.ChangePassword"),
    DELETE_ACCOUNT_TITLE_MAIL                           ("airhubmaster.email.title.DeletedAccount"),

    // exceptions
    USER_NOT_FOUND_EXC                                  ("airhubmaster.exception.UserNotFoundExc"),
    INCORRECT_JWT_EXC                                   ("airhubmaster.exception.IncorrectJwtExc"),
    REFRESH_TOKEN_NOT_FOUND_EXC                         ("airhubmaster.exception.RefreshTokenNotFoundExc"),
    OTA_TOKEN_NOT_FOUND_EXC                             ("airhubmaster.exception.OtaTokenNotFoundExc"),
    ACCOUNT_HAS_BEEN_ALREADY_ACTIVATED_EXC              ("airhubmaster.exception.AccountHasBeenAlreadyActivatedExc"),
    JWT_IS_NOT_RELATED_WITH_REFRESH_TOKEN_EXC           ("airhubmaster.exception.JwtIsNotRelatedWithRefreshTokenExc"),
    LOGIN_ALREADY_EXIST_EXC                             ("airhubmaster.exception.LoginAlreadyExistExc"),
    EMAIL_ADDRESS_ALREADY_EXIST_EXC                     ("airhubmaster.exception.EmailAddressAlreadyExistExc"),

    // spring security
    USER_CREDENTIALS_INVALID_EXC                        ("AbstractUserDetailsAuthenticationProvider.badCredentials");

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private final String holder;
}
