package com.citytechinc.cq.component.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The DialogField annotation is used to mark a Field or Method in a Component
 * Class as an authorable element. Authorable elements are represented in the
 * dialog of the Component to which they belong.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface DialogField {

    /**
     * Allows for explicit definition of a dialog widget xtype associated with
     * the element annotated.
     *
     * @return String
     */
    String xtype() default "";

    /**
     * Applicable to Touch-UI only
     * <p>
     * Allows for explicit definition of a dialog field's sling:resourceType.
     *
     * @return String
     */
    String resourceType() default "";

    /**
     * The path to which the value for the authorable element will be saved
     * during content authoring.
     *
     * @return String
     */
    String name() default "";

    /**
     * The human-readable label for the input field which will be presented in a
     * dialog.
     *
     * @return String
     */
    String fieldLabel() default "";

    /**
     * While not technically part of the dialog property, the field name can be
     * used to define a unique name for the dialog property within your dialog.
     * This field name is used as the element name of the XML element
     * representing this authorable element in the dialog.
     *
     * @return String
     */
    String fieldName() default "";

    /**
     * Populates the fieldDescription widget property in the dialog.
     *
     * @return String
     */
    String fieldDescription() default "";

    /**
     * Indicates that population of the widget input in the dialog is required.
     * Used to set the allowBlank widget property in the dialog.
     *
     * @return boolean
     */
    boolean required() default false;

    /**
     * Used to set the hideLabel widget property in the dialog.
     *
     * @return boolean
     */
    boolean hideLabel() default false;

    /**
     * Used to set the defaultValue widget property in the dialog.
     *
     * @return String
     */
    String defaultValue() default "";

    /**
     * The index number, starting at 1, of the tab in which to place the dialog
     * widget representing this authorable element.
     *
     * @return int
     */
    int tab() default 1;

    /**
     * A list of additional properties not already represented by properties of
     * the annotation. Each additional property is output as a widget property
     * in the dialog.
     *
     * @return FieldProperty[]
     */
    Property[] additionalProperties() default {};

    /**
     * The set of listeners which will be attributed to the dialog widget
     * associated with the authorable element. Listeners are output as
     * properties in the listeners XML node which is a child of the XML node
     * representing the widget in the dialog.
     *
     * @return Listener[]
     */
    Listener[] listeners() default {};

    /**
     * Used to order dialog widgets within a tab. Widgets representing
     * authorable elements with a higher ranking appear lower in the tab than
     * elements with a lower ranking. The ordering of elements of equal ranking
     * is not guaranteed.
     *
     * @return double
     */
    double ranking() default 0;

    /**
     * For Touch-UI Only
     * <p>
     * Many of the Touch UI widgets react to an underlying value being set for
     * the field.
     *
     * @return String
     */
    String value() default "";

    /**
     * For Touch-UI Only
     *
     * @return String
     */
    String title() default "";

    /**
     * Indicates that the particular field should be rendered in a disabled
     * state
     *
     * @return boolean
     */
    boolean disabled() default false;

    /**
     * For Touch-UI Only
     * <p>
     * Additional css classes to attribute to the rendered field
     *
     * @return String
     */
    String cssClass() default "";

    /**
     * Indicates that a Touch UI widget should not be produced for the annotated
     * member
     *
     * @return boolean
     */
    boolean suppressTouchUI() default false;

    /**
     * Indicates that a Touch UI widget should also render as read only
     *
     * @return boolean
     */
    boolean renderReadOnly() default true;

    /**
     * Indicates that a Touch UI widget should show on page creation
     *
     * @return boolean
     */
    boolean showOnCreate() default true;

    /**
     * Indicates that a Touch UI widget should hide on page edit
     *
     * @return boolean
     */
    boolean hideOnEdit() default false;

    /**
     * Applicable to Touch-UI only
     * <p>
     * Sets the sling:orderBefore property. This can be used when supertyping a
     * resource to reorder the dialog fields.
     */
    String orderBefore() default "";
}
