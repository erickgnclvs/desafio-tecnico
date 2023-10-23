/*
 * An XML document type.
 * Localname: getCartorios
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartoriosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorios(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartoriosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartoriosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartoriosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorios");
    
    
    /**
     * Gets the "getCartorios" element
     */
    public br.jus.tjsc.www.selo.GetCartorios getGetCartorios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorios target = null;
            target = (br.jus.tjsc.www.selo.GetCartorios)get_store().find_element_user(GETCARTORIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorios" element
     */
    public void setGetCartorios(br.jus.tjsc.www.selo.GetCartorios getCartorios)
    {
        generatedSetterHelperImpl(getCartorios, GETCARTORIOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorios" element
     */
    public br.jus.tjsc.www.selo.GetCartorios addNewGetCartorios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorios target = null;
            target = (br.jus.tjsc.www.selo.GetCartorios)get_store().add_element_user(GETCARTORIOS$0);
            return target;
        }
    }
}
