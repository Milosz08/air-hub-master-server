/*
 * Copyright (c) 2023 by MILOSZ GILGA <https://miloszgilga.pl>
 * Silesian University of Technology
 */
package pl.miloszgilga.network.account.resdto;

import lombok.Builder;

@Builder
public record UpdatedNameResDto(
    String message,
    String newFirstName,
    String newLastName
) {
}
