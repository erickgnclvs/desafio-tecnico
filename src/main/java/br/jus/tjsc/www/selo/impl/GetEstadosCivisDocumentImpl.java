/*
 * An XML document type.
 * Localname: getEstadosCivis
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosCivisDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEstadosCivis(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEstadosCivisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosCivisDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosCivisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESTADOSCIVIS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosCivis");
    
    
    /**
     * Gets the "getEstadosCivis" element
     */
    public br.jus.tjsc.www.selo.GetEstadosCivis getGetEstadosCivis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosCivis target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosCivis)get_store().find_element_user(GETESTADOSCIVIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEstadosCivis" element
     */
    public void setGetEstadosCivis(br.jus.tjsc.www.selo.GetEstadosCivis getEstadosCivis)
    {
        generatedSetterHelperImpl(getEstadosCivis, GETESTADOSCIVIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEstadosCivis" element
     */
    public br.jus.tjsc.www.selo.GetEstadosCivis addNewGetEstadosCivis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosCivis target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosCivis)get_store().add_element_user(GETESTADOSCIVIS$0);
            return target;
        }
    }
}
