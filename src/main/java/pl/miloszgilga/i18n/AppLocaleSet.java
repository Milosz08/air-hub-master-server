/*
 * Copyright (c) 2023 by MILOSZ GILGA <https://miloszgilga.pl>
 * Silesian University of Technology
 */
package pl.miloszgilga.i18n;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jmpsl.core.i18n.ILocaleEnumSet;

@Getter
@RequiredArgsConstructor
public enum AppLocaleSet implements ILocaleEnumSet {
    // respones
    REGISTERED_RES("airhubmaster.message.RegisteredRes"),
    LOGOUT_RES("airhubmaster.message.LogoutRes"),
    ACTIVATED_ACCOUNT_RES("airhubmaster.message.ActivateAccountRes"),
    RESET_PASSWORD_REQUEST_RES("airhubmaster.message.ResetPasswordRequestRes"),
    RESET_PASSWORD_CHANGE_RES("airhubmaster.message.ResetPasswordChangeRes"),
    NEW_NAME_SET_RES("airhubmaster.message.NewNameSetRes"),
    NEW_LOGIN_SET_RES("airhubmaster.message.NewLoginSetRes"),
    NEW_EMAIL_ADDRESS_SET_RES("airhubmaster.message.NewEmailAddressSetRes"),
    NEW_PASSWORD_SET_RES("airhubmaster.message.NewPasswordSetRes"),
    REMOVE_ACCOUNT_RES("airhubmaster.message.RemoveAccountRes"),
    UPDATE_USER_LEVEL_RES("airhubmaster.message.UpdateUserLevelRes"),
    UPDATE_USER_EXP_RES("airhubmaster.message.UpdateUserExpRes"),
    UPDATE_USER_MONEY_RES("airhubmaster.message.UpdateUserMoneyRes"),
    BOUGHT_PLANE_RES("airhubmaster.message.BougthPlaneRes"),
    BOUGHT_WORKER_RES("airhubmaster.message.BougthWorkerRes"),
    ADD_NEW_CREW_RES("airhubmaster.message.AddNewCrewRes"),
    SEND_PLANE_ON_ROUTE_RES("airhubmaster.message.SendPlaneOnRouteRes"),
    REVERT_PLANE_ON_ROUTE_RES("airhubmaster.message.RevertPlaneOnRouteRes"),
    // email
    ACTIVATED_ACCOUNT_TITLE_MAIL("airhubmaster.email.title.ActivatedAccount"),
    REGISTER_TITLE_MAIL("airhubmaster.email.title.Register"),
    REQUEST_CHANGE_PASSWORD_TITLE_MAIL("airhubmaster.email.title.RequestChangePassword"),
    CHANGE_PASSWORD_TITLE_MAIL("airhubmaster.email.title.ChangePassword"),
    DELETE_ACCOUNT_TITLE_MAIL("airhubmaster.email.title.DeletedAccount"),
    // exceptions
    USER_NOT_FOUND_EXC("airhubmaster.exception.UserNotFoundExc"),
    INCORRECT_JWT_EXC("airhubmaster.exception.IncorrectJwtExc"),
    REFRESH_TOKEN_NOT_FOUND_EXC("airhubmaster.exception.RefreshTokenNotFoundExc"),
    OTA_TOKEN_NOT_FOUND_EXC("airhubmaster.exception.OtaTokenNotFoundExc"),
    ACCOUNT_HAS_BEEN_ALREADY_ACTIVATED_EXC("airhubmaster.exception.AccountHasBeenAlreadyActivatedExc"),
    JWT_IS_NOT_RELATED_WITH_REFRESH_TOKEN_EXC("airhubmaster.exception.JwtIsNotRelatedWithRefreshTokenExc"),
    LOGIN_ALREADY_EXIST_EXC("airhubmaster.exception.LoginAlreadyExistExc"),
    EMAIL_ADDRESS_ALREADY_EXIST_EXC("airhubmaster.exception.EmailAddressAlreadyExistExc"),
    CATEGORY_TYPE_NOT_EXIST_EXC("airhubmaster.exception.CategoryTypeNotExistExc"),
    PLANE_NOT_EXIST_EXC("airhubmaster.exception.PlaneNotExistExc"),
    WORKER_NOT_EXIST_EXC("airhubmaster.exception.WorkerNotExistExc"),
    PLANE_NOT_EXIST_OR_NOT_BOUGHT_EXC("airhubmaster.exception.PlaneNotExistOrNotBoughtExc"),
    WORKER_NOT_EXIST_OR_NOT_BOUGHT_EXC("airhubmaster.exception.WorkerNotExistOrNotBoughtExc"),
    NOT_ENOUGHT_ROUTES_EXC("airhubmaster.exception.NotEnoughtRoutesExc"),
    LOCKED_PLANE_EXC("airhubmaster.exception.LockedPlaneExc"),
    NON_EXISTING_TEMP_STATS_EXC("airhubmaster.exception.NonExistingTempStatsExc"),
    ROUTE_NOT_FOUND_EXC("airhubmaster.exception.RouteNotFoundExc"),
    WORKER_IN_SHOP_NOT_EXIST_EXC("airhubmaster.exception.WorkerInShopNotExistExc"),
    ACCOUNT_HAS_NOT_ENOUGHT_MONEY_EXC("airhubmaster.exception.AccountHasNotEnoughtMoneyExc"),
    // spring security
    USER_CREDENTIALS_INVALID_EXC("AbstractUserDetailsAuthenticationProvider.badCredentials");

    private final String holder;
}
